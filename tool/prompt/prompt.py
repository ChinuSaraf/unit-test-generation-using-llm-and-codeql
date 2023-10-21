from abc import ABC, abstractmethod


class Prompt(ABC):
    prompt = None
    data = None
    idx = 1
    lang = None

    @abstractmethod
    def parse_response(self, prompt_idx, response):
        pass

    @abstractmethod
    def store(self, idx, store):
        pass

    def get_init_prompt(self):
        return self.prompt['init']

    def generate_prompt(self, idx=0):
        if len(self.prompt) <= idx:
            return None
        return self.prompt[str(idx)]

    # Dataset
    def get_code(self):
        return self.data['function']

    def get_func_id(self):
        return str(self.data['func_id'])

    def get_project_repo(self):
        return self.data['project_repo']

    def get_location(self):
        return self.data['location']

    def get_flag(self):
        return self.data['flag']

    # def get_comment(self):
    # 	return self.data[str(self.idx)]['comment']

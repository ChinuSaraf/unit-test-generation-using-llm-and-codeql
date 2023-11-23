from abc import ABC, abstractmethod


class Prompt(ABC):
    prompt = None
    data = None
    idx = 1
    mode_of_exec = 4

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
        return self.data['functionStr']

    def get_func_id(self):
        return str(self.data['funcId'])

    # def get_project_repo(self):
    #     return self.data['project_repo']

    # def get_location(self):
    #     return self.data['location']

    def get_difficulty_level(self):
        return self.data['difficultyLevel']

    # def get_comment(self):
    # 	return self.data[str(self.idx)]['comment']

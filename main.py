import sys
import os.path
import re


# TODO files names, create folders and move legit files to folders
class RainFilter:
    def __init__(self, parsed_args=None, write_path=os.path.dirname(os.path.realpath(__file__))):

        self.parsed_args = parsed_args
        self.write_path = write_path

    def parse_data(self):
        folders = list()
        get_files = os.listdir(self.write_path)
        print(get_files)
        print(" ")
        pattern = re.compile(r"(\w+$)")
        for i in get_files:
            print(i)
            print(type(i))
            print(pattern.fullmatch(i))
            folders.append(pattern.match(i))
        print(folders)


if __name__ == "__main__":
    run = RainFilter()
    run.parse_data()
    sys.exit(0)

import json

import requests
from bs4 import BeautifulSoup


class Webpage:
    def divs(self):
        soup = BeautifulSoup(self.text())
        return soup.find_all('div')

    def text(self):
        pass


class FileWebpage(Webpage):
    def __init__(self, filename):
        self.filename = filename

    def text(self):
        with open(self.filename) as fp:
            return '\n'.join(fp.readlines())


class URLWebPage(Webpage):
    def __init__(self, url):
        self.url = url

    def text(self):
        return requests.get(self.url)


class JsonWebPage(Webpage):
    def __init__(self, json_filename):
        with open(json_filename) as f:
            self.json = json.load(f)

    def text(self):
        return self.json['page']


if __name__ == '__main__':
    pages = [
        FileWebpage('index.html'),
        URLWebPage('example.com'),
        JsonWebPage('page.json'),
    ]
    for page in pages:
        print(page.divs())

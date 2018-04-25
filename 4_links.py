import requests
from bs4 import BeautifulSoup


class Webpage:
    def divs(self):
        soup = BeautifulSoup(self.text())
        return soup.find_all('div')

    def links(self):
        soup = BeautifulSoup(self.text())
        return soup.find_all('a')

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


if __name__ == '__main__':
    pages = [
            FileWebpage('index.html'),
            URLWebPage('example.com'),
        ]
    for page in pages:
        print(page.divs())
        print(page.links())

import requests
from bs4 import BeautifulSoup


class Webpage:
    def divs(self):
        soup = BeautifulSoup(self.html())
        return soup.find_all('div')

    def html(self):
        pass


class FileWebpage(Webpage):
    def __init__(self, filename):
        self.filename = filename

    def html(self):
        with open(self.filename) as fp:
            return '\n'.join(fp.readlines())


class URLWebPage(Webpage):
    def __init__(self, url):
        self.url = url

    def html(self):
        return requests.get(self.url)


if __name__ == '__main__':
    pages = [
            FileWebpage('index.html'),
            URLWebPage('example.com'),
        ]
    for page in pages:
        print(page.divs())

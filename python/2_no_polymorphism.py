import requests
from bs4 import BeautifulSoup


def string_from_file(filename):
    with open(filename) as fp:
        return divs('\n'.join(fp.readlines()))


def string_from_url(url):
    return divs(requests.get(url))


def divs(webpage):
    soup = BeautifulSoup(webpage)
    return soup.find_all('div')


if __name__ == '__main__':
    files = ['index.html', 'dog.html', 'animal.html']
    urls = ['google.com', 'example.com']

    pages = []

    for file in files:
        pages.append(string_from_file(file))

    for url in urls:
        pages.append(string_from_url(url))

    for page in pages:
        print(divs(page))

from bs4 import BeautifulSoup


def divs(filename):
    with open(filename) as fp:
        soup = BeautifulSoup(fp)
    return soup.find_all('div')


if __name__ == '__main__':
    files = ['index.html', 'dog.html', 'animal.html']
    for file in files:
        print(divs(file))

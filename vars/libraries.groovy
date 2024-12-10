def download(repo)
  {
    git "https://github.com/Srujanabayye/${repo}"
  }

def buildartifact()
  {
   sh "mvn package"
  }


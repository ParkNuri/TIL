# Git

---

> Git은 분산형 버전 관리 시스템(DVCS)이다.
>
> 소스코드 형상 관리 도구로써, 작성되는 코드의 이력을 관리한다.

### 0. 기본 설정

---

아래의 설정은 이력 작성자(author)를 설정하는 것으로, 컴퓨터에서 최초에 한번만 설정하면 된다.

``` bash
$ git config --global user.name edutak << 본인 github 계정
$ git config --gloabl user.email e@gmail.com << 본인 이메일
github 가입 이메일로 변경
```

* 잘 되었는지 확인하는 방법

  ```bash
  $ git config --global -l
  user.name=박누리
  user.email=qkrsnrl@naver.com
  
  ```

  

## 로컬 저장소(repository) 활용

### 1. 저장소 초기화

```bash
$ git init
Initialized empty Git repository in C:/Users/student/Desktop/TIL/.git/
(master) $
```

* `(master)`는 현재 있는 branch 위치를 뜻하며, `.git` 폴더가 생성된다.
* 해당 폴더를 삭제하게 되면 모든 `git`과 관련된 이력이 삭제된다.



### 2. add

history를 확정하기 위해서는 `add` 명령어를 통하여 `staging area` 에 `stage` 시킨다.

```bash
$ git add .					# 현재 디렉토리를 stage
$ git add README.md			# 특정 파일을 stage
$ git add images/			# 특정 이미지를 stage
```

add를 한 이후에는 항상 `status` 명령어를 통해 원하는 대로 되었는지 확인한다.

```bash
$ git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        git.md
        images/
        markdown.md

nothing added to commit but untracked files present (use "git add" to track)

```

```bash
$ git add .

```

`git add` 후 `status`

```bash
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   git.md
        new file:   images/download.jpg
        new file:   markdown.md

```



## 3. Commit

---

`git`은 `commit`을 통해 이력을 남긴다.

`commit` 시에는 항상 메세지를 통해 해당 이력의 정보를 나타내야 한다.

```bash
$ git commit -m 'Init' 		<<''내에 commit 수정사항 naming 
[master (root-commit) cd5dfe0] Init; git commit -m Init
 3 files changed, 104 insertions(+)
 create mode 100644 git.md
 create mode 100644 images/download.jpg
 create mode 100644 markdown.md

```

`commit` 목록은 아래의 명령어를 통해 확인 가능하다.

```bash
$ git log
commit cd5dfe07f309ac1de3dee73fad639d02060c81de (HEAD -> master)
Author: ParkNuri <qkrsnrl@naver.com>
Date:   Thu Dec 5 16:59:56 2019 +0900

    Init;
    git commit -m Init
```

`git.md` 파일 수정 후 `git status` 시

```bash
git status
hanges not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   git.md
```

`git staus`로 확인 후 `git add .` 

```bash
$ git add .
```

repository 생성 후 <>code 의 코드 복사 붙여넣기



## 2. 원격 저장소(remote repository) 활용

> 원격 저장소는 다양한 서비스를 통해 제공 받을 수 잇다.
>
> github, gitlab, bitbucket

### 1. 원격 저장소 등록

```bash
$ git remote add origin https~ << url
```

원격 저장소(remote)를 `origin` 이라는 이름으로 해당 url로 설정한다.

등록된 원격 저장소는 아래의 명령어로 확인할 수 있다.

등록은 한번만 실행하면 된다.

``` bash
$ git remote -v
origin https://github.com:ParkNuri/TIL.git (fetch)
origin  git@github.com:ParkNuri/TIL.git (push)

```

### 2. 원격 저장소 push

```bash
$ git push origin master
Enumerating objects: 9, done.
Counting objects: 100% (9/9), done.
Delta compression using up to 4 threads
Compressing objects: 100% (7/7), done.
Writing objects: 100% (9/9), 9.81 KiB | 3.27 MiB/s, done.
Total 9 (delta 0), reused 0 (delta 0)
To https://github.com/ParkNuri/TIL.git
 * [new branch]      master -> master

```

`origin` 원격 저장소에 `push`하게 되며 이후 작업 과정에서는 `add`->
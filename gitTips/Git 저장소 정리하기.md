github 특강2																																					2020.04.23

---

# Git 명령어로 저장소 정리하기

## Github

> 분산형 버전 관리 시스템 (DVCS)

:left_right_arrow:  중앙 집중형 버전관리 시스템







## git bash

> git bash는 CLI(CommandLine Interface) 환경에서 실행된다.

:left_right_arrow: GUI(Graphic User Interface)



* 저장소 형태

![image-20200423102406376](C:\Users\student\AppData\Roaming\Typora\typora-user-images\image-20200423102406376.png)



## CLI 기초 명령어

```bash
# list (파일 목록)
$ ls
# change directory (디렉터리 변경)
$ cd
# remove (삭제)
$ rm
```



## git 명령어

* commit 구조도

![image-20200423142611836](images/image-20200423142611836.png)



### 1. Local 저장소 초기화 및 파일 생성

```bash
$ git init	# 저장소 초기화
$ touch a.txt	# a.txt 파일 생성
$ git status	# 저장소 상태 체크

On branch master	

No commits yet	

Untracked files: # 트래킹x, new file
  (use "git add <file>..." to include in what will be committed)	
  # commit 영역으로 옮기려면 git add를 사용해라
        a.txt	

nothing added to commit but untracked files present (use "git add" to track) 
# Working Directory o, staging area x.
```



### 2. Local 저장소 내의 파일 stage & commit

* stage


```bash
$ git add .
$ git status
On branch master

No commits yet

Changes to be committed:	# commit될 변경사항들 (staging area o)
  (use "git rm --cached <file>..." to unstage)	# unstage를 위해서 활용할 명령어 (add 취소)
        new file:   a.txt

```

* commit

```bash
$ git commit -m 'Create a.txt'	# git commit with message
[master (root-commit) 553edc9] Create a.txt
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 a.txt
 
$ git log	# show commit list
commit 553edc9b43a11f519ca2bd6eb0b2d6febfc5c2aa (HEAD -> master)	# hash val = unique num
Author: ParkNuri <qkrsnrl@naver.com>
Date:   Thu Apr 23 10:38:43 2020 +0900

    Create a.txt

$ git log --oneline	# show commit list in one line
553edc9 (HEAD -> master) Create a.txt

$ git status
On branch master
nothing to commit, working tree clean	# status after commit
```



### 3. 추가 파일 변경 상태

```bash
$ touch b.txt
$ git status
On branch master
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)	# 최신버전
        modified:   a.txt									# 기존 파일 + 새 파일 모두 취소															# rm은 새 파일만 취소

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        b.txt

no changes added to commit (use "git add" and/or "git commit -a")
```



### 4. commit 메세지 수정

> **주의!!**  commit 메세지 변경시 **해시값 자체**가 변경된다. 
>
> 그래서 **이미 원격저장소에 push한 이력**에 대해서는 commit 메세지를 변경하면 안된다.

```bash
$ git commit --amend
```

명령어 입력시 **commit 메시지 파일**이 **`vim` 텍스트 편집기**로 열린다.

* `i` : 편집 모드

* `esc` 편집모드를 종료하고 명령 모드에서 저장

  * `:wq` 

    commit 메세지 수정 종료 (write & quit)

  * `:q`

    수정하지 않고 종료
  
  * `:q!`
  
    수정 사항 반영하지 않고 종료
  

```bash
$ git commit --amend
[master 7b510da] a.txt 수정, b.txt 생성		# commit msg 수정 후
 Date: Thu Apr 23 10:51:16 2020 +0900
 2 files changed, 1 insertion(+)
 create mode 100644 b.txt
```



### 4-1. 특정 파일을 빼놓고 commit 했을 때

> 빠진 파일을 `add`한 이후에 `commit --amend`를 하면 해당 파일까지 포함하여 재commit할 수 있다.

```bash
$ git add <omit_file>
$ git commit --amend
[master 9010772] a.txt 수정, b.txt 생성, omit_file 생성
 Date: Thu Apr 23 10:51:16 2020 +0900
 2 files changed, 2 insertions(+)
 create mode 100644 omit_file
```



### 5. working directory를 직전 commit 상태로 돌리고 싶을때

> `restore`명령어를 사용하면 이전 버전으로 되돌릴 수 있다.

```bash
$ git status
On branch master
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   a.txt

no changes added to commit (use "git add" and/or "git commit -a")

$ git restore a.txt
$ git status
On branch master
nothing to commit, working tree clean
```



### 6. 특정 파일/폴더 삭제 commit

> 해당 명령어는 실제 파일이 삭제되는 것은 아니지만, git에서 삭제되었다라는 이력을 남기는 것.



```bash
$ git rm --cached b.txt
rm 'b.txt'

$ git status
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        deleted:    b.txt

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        b.txt
        
# 주의!! 해당 파일이 물리적으로 삭제되는 것은 아니다.
```

* 일반적으로는 `.gitignore`와 함께 활용한다.

  1. `.gitignore`에 해당 파일 등록
  2. `git rm --cached`를 통해 삭제 commit

  * 이렇게 작업을 하면, 실제 파일은 삭제되지 않지만 이후로 git으로 전혀 관리되지 않는다.

  * 프로젝트 환경 관련 파일이나 민감정보를 `.gitignore`에 포함하여 git commit에서 제외한다.

    ※ http://gitignore.io/ 에서 내 프로젝트에 맞는 `gitignore` 파일을 생성해준다.



### 7. 원격 저장소 추가

```bash
# 원격 저장소에 origin이라는 이름의 url을 추가
$ git remote add origin <url>

# 원격 저장소 목록 조회
$ git remote -v

# 원격 저장소 origin 삭제 
$ git remote rm origin

# 원격 저장소에 올리기
$ git push origin master
```





## 내 repository로 push가 안된다?!!

#### 1. 내 아이디인지 확인

```bash
$ git config --global -l
user.name=my_name
user.email=my_email
```

#### 2. 계정 변경

```bash
git config --global user.name new_name
git config --global user.email new_email
```

#### 2-1. 계정 삭제
```bash
git config --unset --global user.name
git config --unset --global user.email
```




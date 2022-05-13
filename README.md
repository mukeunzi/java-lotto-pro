# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

---

## Step2. 문자열 덧셈 계산기 ➕

### 기능 요구사항

**문자열 쪼개기**
- [ ] 기본 구분자(쉼표, 콜론)를 통해 문자열을 쪼개는 기능
- [ ] 커스텀 구분자(`//커스텀구분자\n`)를 통해 문자열을 쪼개는 기능

**덧셈 계산기**
- [ ] empty string이나 null일 경우 0을 반환하는 기능
- [ ] 음수 혹은 숫자가 아닐 경우 RuntimeException 발생시키는 기능
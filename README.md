# 로또

## 진행 방법

* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정

* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

</br>

---

## 요구사항

<details>
<summary><b>🚀 1단계 - 문자열 계산기</b></summary>

**기능 요구사항**
> - [X] 더하기
> - [X] 빼기
> - [X] 곱하기
> - [X] 나누기
> - [X] 입력 문자열이 null이거나 공백이면 에러
> - [X] 입력된 기호가 사칙연산이 아니면 에러

</details>

<details>
<summary><b>🚀 2단계 - 로또(자동)</b></summary>

**기능 요구사항**
> - [X] 구입 금액이 1000원 미만인 경우 예외처리한다. (로또 티켓 장당 1000원)
> - [X] 1~45까지의 로또 번호를 자동 생성한다.
> - [X] 한 장의 로또 티켓 내 포함된 당첨 번호의 갯수를 구한다.
> - [X] 당첨 번호 갯수에 따른 상금은 다음과 같다.
>> - 3개 일치 시, 5,000원
>> - 4개 일치 시, 50,000원
>> - 5개 일치 시, 1,500,000원
>> - 6개 일치 시, 2,000,000,000원
> - [X] 로또 결과 수익률을 계산한다.

</details>

<details>
<summary><b>🚀 3단계 - 로또(2등)</b></summary>

**기능 요구사항**
> - [X] 보너스볼을하나 더 입력받는다.
> - [X] 입력받은 보너스볼도 기존 입력한 당첨번호와 중복되면 안된다.
> - [X] 당첨번호가 보너스볼 포함 5개 일치 시, 당첨통계 2등으로 처리한다.
> - [X] 당첨 번호 갯수에 따른 상금은 다음과 같다.
>> - 3개 일치 시, 5,000원
>> - 4개 일치 시, 50,000원
>> - 5개 일치 시, 1,500,000원
>> - 보너스볼 포함 5개 일치 시, 30,000,000원
>> - 6개 일치 시, 2,000,000,000원

</details>

<details>
<summary><b>🚀 4단계 - 로또(수동)</b></summary>

**기능 요구사항**
> - 3단계 기능에 더하여..
> - [ ] 수동으로 구매할 로또 수를 입력받는다.
> - [X] 이 때, 수동 구입 갯수가 0인 경우, 수동 번호를 입력받지 않고 바로 자동 번호를 생성한다.
> - [ ] 수동 구입 갯수가 0 초과인 경우, 수동으로 구매할 번호를 입력받는다.
> - [X] '입력한 구입금액'에서 '수동 구입금액'을 제한 나머지로 '자동 로또'를 구매한다.
>> - [X] 단, 수동 구입 후 잔액이 1000원 미만인 경우 자동 구입금액은 0원이다.
> - [X] 수동 구입금액이 입력한 총 구입금액을 초과할 경우 예외처리한다.

</details>

</br>

![image](https://github.com/jaekkang/wanted_3rd_assignment_moneymwoni/assets/45617104/798bf0d6-cd4c-478d-9236-2e22e8adaa6d)

## 예산 관리 어플리케이션

> 본 서비스는 사용자들이 개인 재무를 관리하고 지출을 추적하는 데 도움을 주는 애플리케이션을 위한 백엔드 서비스입니다.

## Table of Contents

- [개요](#개요)
- [API Reference](#api-reference)
- [프로젝트 진행 및 이슈 관리](#프로젝트-진행-및-이슈-관리)
- [구현과정(설계 및 의도)](<#구현과정(설계-및-의도)>)
- [TIL 및 회고](#til-및-회고)

## 개요

> 해당 서비스의 경우, 이 앱은 매달 사용할 예산을 설정하고, 카테고리별 지출을 기록하여 사용자가 자신의 지출을 분석, 조율할 수 있도록 도움을 줍니다. 사용자가 직접 관리하게 됨으로써 무의식적인 지출을 경계하게 되어 불필요한 소비를 줄이고
지출 계획을 마련함으로써 **현명한 소비**를 할 수 있도록 할 것입니다.

## API Reference

## 프로젝트 진행 및 이슈 관리

## 구현과정(설계 및 의도)

<details>
    <summary>유저 등록 - click</summary>

  - **회원가입**
  
    1. `계정`은 유저의 id를 기입
  
    - 계정 생성시 테이블에 Trigger로 유저의 id가 생성되며 [US + yyMMdd + 4자리의 일련번호] 형식으로 생성
  
    2. `비밀번호`는 아래와 같은 `제약 조건`을 가지며, `암호화`하여 데이터베이스에 저장
  
    - 비밀번호는 최소 10자 이상
    - 숫자, 문자, 특수문자 3가지를 포함해야합니다.
  
  - **로그인**
    1. 계정, 비밀번호로 로그인 시 JWT토큰이 발급됩니다.
    2. JWT 토큰은 Access token과 Refresh token 두개가 발급됩니다.
    - 이 떄 Refresh token은 유저 테이블에 저장되며 보안을 위해 해싱하여 저장됩니다.
    3. 이후 게시물, 통계 API 요청 Header에 Access token가 항시 포함되며, JWT 유효성을 검증합니다.
    4. Aaccess token 만료시 Refresh token을 포함하여 재발급 요청시 Refresh 유효성 검증 후 Access토큰을 재발급합니다,
</details>

## TIL 및 회고

package org.example;

public class User {
    private String password;

    public void initPassword(PasswordGenerator passwordGenerator) {
        // RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        // 랜덤 제너레이터는 강결합. 제거함으로서 더 낮은 결합도를 가지고 테스트 하기 쉬운 코드를 작성할 수 있다.
        String password = passwordGenerator.generatePassword();

        if (password.length() >= 8 && password.length() <= 12) {
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}

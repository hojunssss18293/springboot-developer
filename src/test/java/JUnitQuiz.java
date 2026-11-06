import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class JUnitQuiz {
    @Test
    public void junitTest(){
        String name1 = "홍길동";
        String name2 = "홍길동";
        String name3 = "홍길은";
    }

    @Test
    public void junitQuiz1(){
        String name1 = "홍길동";
        String name2 = "홍길동";
        String name3 = "홍길은";

        assertThat(name1).isNotNull();
        assertThat(name2).isNotNull();
        assertThat(name3).isNotNull();

        assertThat(name1).isEqualTo(name2);

        assertThat(name1).isNotEqualTo(name3);
    }
    @Test
    public void junitTest2(){
        int number1 = 15;
        int number2 = 0;
        int number3 = -5;
    }

    @Test
    public void junitQuiz2(){
        int number1 = 15;
        int number2 = 0;
        int number3 = -5;

        assertThat(number1).isNotNull();
        assertThat(number2).isNotNull();
        assertThat(number3).isNotNull();

        assertThat(number1).isEqualTo(number2);

        assertThat(number1).isNotEqualTo(number3);
    }
}

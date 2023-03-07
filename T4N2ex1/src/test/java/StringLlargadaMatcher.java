import org.hamcrest.Description;
import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

//Creem una class matcher per llegir llargada de String
public class StringLlargadaMatcher extends TypeSafeMatcher<String> {
//atribut Matcher de integer
    private Matcher<Integer>llargMatcher;
//Constructor rep tipus matcher integer
    public StringLlargadaMatcher( Matcher<Integer> llargMatcher) {
        super(String.class);
        this.llargMatcher = llargMatcher;
    }
//override methods
    @Override
    protected boolean matchesSafely(String s) {
        return false;
    }

    @Override
    public void describeTo(Description description) {
    description.appendText("la llargada del text");
    }

    //Creem el metode que calcula llargada que retorna FeatureMatcher
    public static Matcher<String> teLlargada(Matcher<Integer> llargMatcher){
        return new FeatureMatcher<String,Integer>(llargMatcher,"String amb llargada ","llargada") {
            @Override
            protected Integer featureValueOf(String s) {
                return s.length();
            }
        };
    }

    //Creem clase test per probar el matcher anterior
    public static class StringLlargadaMatcherTest{
        //Creem metode per probar amb assertThat i posem dades si el valor no es 6 dona error
        @Test
        public void testStringLlargadaMatcher(){
            assertThat("Mordor",StringLlargadaMatcher.teLlargada(is(6)));
        }
    }

}

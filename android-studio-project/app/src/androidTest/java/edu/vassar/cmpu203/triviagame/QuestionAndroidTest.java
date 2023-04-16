package edu.vassar.cmpu203.triviagame;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static java.util.regex.Pattern.matches;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.UiController;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;

import edu.vassar.cmpu203.triviagame.controller.MainActivity;
import edu.vassar.cmpu203.triviagame.model.Choice;
import edu.vassar.cmpu203.triviagame.model.Question;
import edu.vassar.cmpu203.triviagame.model.RandMultiChoice;

@RunWith(AndroidJUnit4.class)
public class QuestionAndroidTest {
    @org.junit.Rule
    public ActivityScenarioRule<MainActivity> activityRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void RunningThroughQuestions(){
        RandMultiChoice r = new RandMultiChoice();
        // Perform a click action on a view
        onView(ViewMatchers.withId(R.id.wwmbutton)).perform(ViewActions.click());
        int count = 0;
        while(count!=5) {
            String prompt = getText(withId(R.id.aQuestion));
            Log.d("prompt", prompt);


            Question q = r.searchQuestion(prompt);
            String correct = q.getCorrectChoice().toString();
            String choiceA = getText(withId(R.id.choicea));
            String choiceB = getText(withId(R.id.choiceb));
            String choiceC = getText(withId(R.id.choicec));
            String choiceD = getText(withId(R.id.choiced));
            if (correct.equals(choiceA)) {
                onView(ViewMatchers.withId(R.id.choicea)).perform(ViewActions.click());
            } else if (correct.equals(choiceB)) {
                onView(ViewMatchers.withId(R.id.choiceb)).perform(ViewActions.click());
            } else if (correct.equals(choiceC)) {
                onView(ViewMatchers.withId(R.id.choicec)).perform(ViewActions.click());
            } else if (correct.equals(choiceD)) {
                onView(ViewMatchers.withId(R.id.choiced)).perform(ViewActions.click());
            }

            onView(ViewMatchers.withId(R.id.submitbutton)).perform(ViewActions.click());
            count++;
            if(count!=5){
                onView(ViewMatchers.withId(R.id.nextbutton)).perform(ViewActions.click());
            }
        }

    }
    String getText(final Matcher<View> matcher) {
        final String[] stringHolder = { null };
        onView(matcher).perform(new ViewAction() {
            @Override
            public Matcher<View> getConstraints() {
                return isAssignableFrom(TextView.class);
            }

            @Override
            public String getDescription() {
                return "getting text from a TextView";
            }

            @Override
            public void perform(UiController uiController, View view) {
                TextView tv = (TextView)view; //Save, because of check in getConstraints()
                stringHolder[0] = tv.getText().toString();
            }
        });
        return stringHolder[0];
    }


}
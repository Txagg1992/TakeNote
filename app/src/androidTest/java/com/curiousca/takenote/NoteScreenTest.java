package com.curiousca.takenote;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class NoteScreenTest {

    @Rule
    public ActivityTestRule<MainActivity> mNoteActivityTestRule =
            new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void clickAddNoteButton_opensEditorActivity() throws Exception{
        onView(withId(R.id.fab))
                .perform(click());
        onView(withId(R.id.editText))
                .check(matches(isDisplayed()));
    }

}

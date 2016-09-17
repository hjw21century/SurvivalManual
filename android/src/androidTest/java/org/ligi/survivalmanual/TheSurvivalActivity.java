package org.ligi.survivalmanual;

import android.support.test.espresso.contrib.DrawerActions;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;


public class TheSurvivalActivity {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    /*
    @Test
    public void thatActivityShouldLaunch() {
        Spoon.screenshot(activityTestRule.getActivity(), "main");
    }

    @Test
    public void thatThatHelpOpens() {
        onView(withId(R.id.menu_help)).perform(click());

        onView(withText(R.string.help_title)).check(matches(isDisplayed()));
        Spoon.screenshot(activityTestRule.getActivity(), "help");
    }
*/
    /* TODO bring back this test - was flaky on one emulator - hanging when opening the drawer
    */
    @Test
    public void testWeCanOpenAllTopics() {
        onView(withId(R.id.drawer_layout)).perform(DrawerActions.open());
        /*
        for (final Integer integer : NavigationDefinitions.INSTANCE.getMenu2htmlMap().keySet()) {


            onView(withId(R.id.navigationView)).perform(navigateTo(integer));

            final MainActivity activity = activityTestRule.getActivity();
            final CharSequence subtitle = activity.getSupportActionBar().getSubtitle();
            assertThat(subtitle).isEqualTo(activity.getString(NavigationDefinitions.INSTANCE.getTitleResById(integer)));

            Spoon.screenshot(activity, "topic_" + subtitle.toString().replace(" ", "_").replace("/", "_"));
        }
        */
    }


}

/*
package geyzenbag_marcphilipp.extensions;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DisabledOnConferenceExtension implements TestExecutionCondition {
    @Override
    public ConditionEvaluationResult evaluate(TestExtensionContext context) {
        return LocalDate.now().getDayOfWeek() == DayOfWeek.SUNDAY
                ? ConditionEvaluationResult.disabled("You're at Heisenbug!")
                : ConditionEvaluationResult.enabled("Get some work done!");
    }
}
*/

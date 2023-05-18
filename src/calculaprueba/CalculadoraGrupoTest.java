package calculaprueba;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalculadoraExtraTest.class, CalculadoraFinancieraTest.class, CalculadoraNormalTest.class,
		UtilTest.class })
public class CalculadoraGrupoTest {

}

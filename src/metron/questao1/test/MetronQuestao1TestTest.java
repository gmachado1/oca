package metron.questao1.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import metron.questao1.MetratonQuestao1;

class MetronQuestao1TestTest {


	@BeforeEach
	void setUp() throws Exception{
		System.out.println("--------------------------------------------------------------------------------- ");
		System.out.println("                iniciando novo método de Teste!                                      ");
	}

	@AfterEach
	void tearDown() throws Exception{
		System.out.println("                finalizando um método do Teste!                                      ");
		System.out.println("--------------------------------------------------------------------------------- ");
	}
	
	@Test
	@DisplayName("Teste 1")
	void testSequenceNumberCombination(TestInfo testInfo ) {
		MetratonQuestao1 mq1 = new MetratonQuestao1();
		String msg= "SEMPRE ACESSO O DOJOPUZZLES";
		Assertions.assertEquals("77773367_7773302_222337777_777766606660366656667889999_9999555337777",
				mq1.setString2NumberMessage(msg), "convertendo 'SEMPRE ACESSO O DOJOPUZZLES' ");
		 Assertions.assertEquals("Teste 1", testInfo.getDisplayName(),
                 () -> "TestInfo foi injetado corretamente");
	}
}

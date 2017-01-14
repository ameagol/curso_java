package Animais;

import br.com.dextraining.animais.Jacare;
import br.com.dextraining.animais.Veterinario;

public class Examinar {

	public static void main(String[] args) {
		
		Jacare jacare = new Jacare();
		Veterinario veterinario = new Veterinario();
		
		veterinario.examinar(jacare);
		
	}
}

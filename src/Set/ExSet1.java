package Set;

import java.util.*;

/*
Crie uma conjunto contendo as cores do arco-�ris e:
a) Exiba todas as cores o arco-�ris uma abaixo da outra; OK
b) A quantidade de cores que o arco-�ris tem; OK
c) Exiba as cores em ordem alfab�tica; OK
d) Exiba as cores na ordem inversa da que foi informada; OK
e) Exiba todas as cores que come�am com a letra �v�; OK
f) Remova todas as cores que n�o come�am com a letra �v�; OK
g) Limpe o conjunto; OK
h) Confira se o conjunto est� vazio; OK
 */

public class ExSet1 {

	public static void main(String[] args) {
		
		System.out.println("Crie uma conjunto contendo as cores do arco-�ris: ");
		Set<String> coresArcoIris = new HashSet<>();
		coresArcoIris.add("vermelho");
		coresArcoIris.add("laranja");
		coresArcoIris.add("amarelo");
		coresArcoIris.add("verde");
		coresArcoIris.add("azul");
		coresArcoIris.add("anil");
		coresArcoIris.add("violeta");
		
		//a) Exiba todas as cores o arco-�ris uma abaixo da outra
		System.out.println("Exiba todas as cores o arco-�ris uma abaixo da outra");
		for (String cores : coresArcoIris) {
			System.out.println(cores);
		}
		
		//b) A quantidade de cores que o arco-�ris tem
		System.out.println("\nA quantidade de cores que o arco-�ris tem");
		System.out.println(coresArcoIris.size());
		
		//c) Exiba as cores em ordem alfab�tica
		System.out.println("\nExiba as cores em ordem alfab�tica");
		Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
		for (String cor : coresArcoIris2) {
			System.out.println(cor);
		}
		
		// d) Exiba as cores na ordem inversa da que foi informada
		System.out.println("\nExiba as cores na ordem inversa da que foi informada");
		Set<String> coresArcoIris3 = new LinkedHashSet<>(Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"));
        System.out.println("Ordem Original " + coresArcoIris3);
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println("Ordem inversa " + coresArcoIrisList);
		
		//e) Exiba todas as cores que come�am com a letra �v�
		System.out.println("\nExiba todas as cores que come�am com a letra �v�");
		for (String cor: coresArcoIris) {
            if(cor.startsWith("v")) System.out.println(cor);
        }
		
		//f) Remova todas as cores que n�o come�am com a letra �v�;
		System.out.println("\nRemova todas as cores que n�o come�am com a letra �v�");
		Iterator<String> iterator = coresArcoIris.iterator();
	        while (iterator.hasNext()) {
	            if (!iterator.next().startsWith("v")) iterator.remove();
	        }
	        System.out.println(coresArcoIris);

	    //g) Limpe o conjunto;	        
	    System.out.println("\nLimpe o conjunto: ");
	    coresArcoIris.clear();

	    //h) Confira se o conjunto est� vazio
	    System.out.println("Confira se o conjunto est� vazio: " + coresArcoIris.isEmpty());
	        
	}

}

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class Datas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 5);
		int anos = hoje.getYear() - olimpiadasRio.getYear();
		System.out.println(anos);
		Period periodo = Period.between(olimpiadasRio, hoje);
		System.out.println(periodo.getYears()+" "+ periodo.getMonths()+" "+periodo.getDays());
		LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
		System.out.println(proximasOlimpiadas);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(proximasOlimpiadas.format(formatador));
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy  hh:mm");
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora);
		System.out.println(agora.format(formatadorComHoras));
		

	}

}

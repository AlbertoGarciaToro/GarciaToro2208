
public class GarciaToroJavaAFondo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hola";
		int x=s.length();
		boolean b=s.isEmpty();
		System.out.println(x);
		System.out.println(b);
		
		String x1="Hola";
		String x2="Hola";
		if(x1.equals(x2));
		System.out.println("Si pasa por aqui");
		
		String s1="Hola como estas?";
		int s2=s1.indexOf('a');
		int s3=s1.lastIndexOf('a');
		System.out.println(s2);
		System.out.println(s3);
		
		String a="Hola,como estas? Estas como querias?";
		int p1=a.indexOf("como");
		int p2=a.indexOf("estas");
		int p3=a.lastIndexOf("como");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		String s4="Hola, como estas?";
		String may=s4.toUpperCase();
		String min=s4.toLowerCase();
		String s5=s4.substring(0,4);
		String s6=s4.substring(6,10);
		String s7=s4.substring(11);

		System.out.print(may +  min +s5+s6+s7);
		String n="1234";
		int i=Integer.parseInt(n);
		String n1=Integer.toString(i);
		
		String n2="1234.56";
		double d=Double.parseDouble(n2);
		String d1=Double.toString(d);
		System.out.println(d+d1+ i+n1);
		String g="Hola,";
		String g1="que tal?";
		String g2=g+g1;
		System.out.println(g2);
		
		String f="Hola";
		f+=",chau";
		System.out.println(f);
		
		StringBuilder sb=new StringBuilder();
		sb.append("Hola,");
		sb.append("Chau");
		System.out.println(sb);
		
		StringBuilder sd=new StringBuilder("Hola");
		sd.setCharAt(2,'X');
		System.out.println(sd);
		
		
		
	}

}
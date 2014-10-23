public class Main(){
	public static void main(String []args){
		int i=0;
		//N motor pin number
		int nmotor=//pin number;
		//weight pin
		int weight=A//pin number;
		while(i==0){
			pinMode(nmotor, //manageable speed);
			double w= analogRead(weight)
			if (w != [Default value given angle etc...]){
				if (w<[Lightest glass bottle]){
					Set “L” gates to open;
					delay(//specific value to account for speed/friction);
					Set “L” gates to close;
				}
				else{
					//Knocks object into bin. 
					Set “O” servos to on.
					delay(//specific amount);
					//reset “O” servos
					break;
				}
				double l= Read light sensor;
				if (l<[Light]){
					Set “L” gates to open.
					delay(//specific value to account for speed/friction);
					Set “L” gates to close;
				}
				else{
					Set “O” servos to on.
					delay(//specific amount);
					reset “O” servos
					break;
				}
				int p= Read proximity sensor
				int test= 0;
				int count =0;
				Set “O” servos to on
				while(p!=test){
				if(count%2==0){
					test= Read proximity sensor;
				}
				else
					p= Read proximity sensor;
					count++;
				}
				Set “O” servos to off
				if(Conductive){
					Set “O” servos to on.
					delay(//specific amount);
					reset “O” servos
					break;
				}
				else{
					reset “O” servos
					Set “L” gates to open.
					delay(//specific value to account for speed/friction);
					Set “L” gates to close;
					break;
				}
			}
		//stopping it
		pinMode(nmotor, 0)
	}
}
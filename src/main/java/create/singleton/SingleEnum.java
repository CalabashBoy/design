//SingletonEnum.instance.method();
//反射场景，只有枚举单例模式才能保证唯一性
public enum SingletonEnum {
	
	 instance; 
	 
	 private SingletonEnum() {}
	 
	 public void method(){
	 }

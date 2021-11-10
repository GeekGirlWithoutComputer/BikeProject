package be.duquesne.POJO;

public abstract class Category 
{
	public enum TypesMember
	{
		CYCLO,
		VTT
	
	};
	public enum TypesVtt 
	{
		HIKER,
		TRIALIST,
		DESCENDER,
		BASE   // si cyclo et pas vtt
	};
	private TypesVtt type;
	private TypesMember typeVelo;
	private int codeCat;
}

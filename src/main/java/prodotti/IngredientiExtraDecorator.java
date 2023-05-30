package prodotti;

public abstract class IngredientiExtraDecorator extends Pizza {

	public Pizza pizza;

	@Override
	public abstract String getNome();

	@Override
	public abstract double getPrezzo();

	@Override
	public abstract long getCalorie();

	@Override
	public abstract String getIngredientiBase();

}

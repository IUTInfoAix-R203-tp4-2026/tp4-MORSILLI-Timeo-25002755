package fr.univ_amu.iut.exercice6;

public class BrieItem extends ItemUpdater {
  public BrieItem(Item item) {
    super(item);
  }

  @Override
  public void update() {
    if (getItem().quality < 50) increaseQuality();

    decreaseSellIn();

    if (getItem().sellIn < 0 && getItem().quality < 50) {
      increaseQuality();
    }
  }
}

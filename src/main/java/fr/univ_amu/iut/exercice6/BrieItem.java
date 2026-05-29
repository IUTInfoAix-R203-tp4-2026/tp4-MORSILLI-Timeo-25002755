package fr.univ_amu.iut.exercice6;

public class BrieItem extends ItemUpdater {
  public BrieItem(Item item) {
    super(item);
  }

  @Override
  public void update() {
    increaseQuality();

    decreaseSellIn();

    if (item.sellIn < 0) increaseQuality();
  }
}

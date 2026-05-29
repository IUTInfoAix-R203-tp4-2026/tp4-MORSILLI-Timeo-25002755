package fr.univ_amu.iut.exercice6;

public class BackstageItem extends ItemUpdater {
  public BackstageItem(Item item) {
    super(item);
  }

  @Override
  public void update() {
    increaseQuality();

    if (item.sellIn < 11) increaseQuality();

    if (item.sellIn < 6) increaseQuality();

    decreaseSellIn();

    if (item.sellIn < 0) clearQuality();
  }
}

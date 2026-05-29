package fr.univ_amu.iut.exercice6;

public class BackstageItem extends ItemUpdater {
  public BackstageItem(Item item) {
    super(item);
  }

  @Override
  public void update() {
    if (getItem().quality < 50) increaseQuality();

    if (getItem().sellIn < 11 && getItem().quality < 50) increaseQuality();

    if (getItem().sellIn < 6 && getItem().quality < 50) increaseQuality();

    decreaseSellIn();

    if (getItem().sellIn < 0) getItem().quality = 0;
  }
}

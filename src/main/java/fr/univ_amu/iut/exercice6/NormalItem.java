package fr.univ_amu.iut.exercice6;

public class NormalItem extends ItemUpdater {

  public NormalItem(Item item) {
    super(item);
  }

  @Override
  public void update() {
    if (getItem().quality > 0) decreaseQuality();

    decreaseSellIn();

    if (getItem().sellIn < 0) if (getItem().quality > 0) decreaseQuality();
  }
}

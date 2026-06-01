package fr.univ_amu.iut.exercice6;

public class ConjuredItem extends ItemUpdater {
  public ConjuredItem(Item item) {
    super(item);
  }

  @Override
  public void update() {
    if (item.sellIn == 0) item.quality -= 4;
    if (item.sellIn > 0) item.quality -= 2;
    if (item.quality < 0) item.quality = 0;
  }
}

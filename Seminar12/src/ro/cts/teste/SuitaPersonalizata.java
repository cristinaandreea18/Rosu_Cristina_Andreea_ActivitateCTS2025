package ro.cts.teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.cts.categorii.CategorieBoundary;
import ro.cts.categorii.CategorieRight;

@RunWith(Categories.class)
@Suite.SuiteClasses({getVarstaTest.class, AplicaDiscountTest.class})
@Categories.IncludeCategory(CategorieRight.class)
@Categories.ExcludeCategory(CategorieBoundary.class)
public class SuitaPersonalizata {
}

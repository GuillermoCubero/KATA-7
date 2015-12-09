package kata7.control;

import kata7.model.Histogram;
import kata7.view.HistogramDisplay;
import kata7.view.PopulationDialog;
import kata7.view.AttributeDialog;
import kata7.view.HistogramBuilder;

public class CalculateCommand implements Command {
    
    private final AttributeDialog attributeDialog;
    private final PopulationDialog populationDialog;
    private final HistogramDisplay display;

    public CalculateCommand(AttributeDialog attributeDialog, PopulationDialog populationDialog, HistogramDisplay display) {
        this.attributeDialog = attributeDialog;
        this.populationDialog = populationDialog;
        this.display = display;
    }

    public AttributeDialog getAttributeDialog() {
        return attributeDialog;
    }

    public PopulationDialog getPopulationDialog() {
        return populationDialog;
    }

    public HistogramDisplay getDisplay() {
        return display;
    }

    @Override
    public void execute() {
        Histogram histogram = new HistogramBuilder(populationDialog.population()).build(attributeDialog.attribute());
               
    }

    
}

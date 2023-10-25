package deu.java002_02.gui;

public final class SeatView extends View
{
    private static final int resolutionX = 1280;
    private static final int resolutionY = 960;
    
    private SeatModel m_model;

    public SeatView(String title)
    {
        super(title);

        String modelClassName = SeatModel.class.getName();

		if(!ModelManager.getInstance().hasModel(modelClassName))
			ModelManager.getInstance().addModel(modelClassName, new SeatModel());
		
		m_model = (SeatModel)ModelManager.getInstance().getModel(modelClassName);
		m_model.registerView(this);
		
		super.openView(resolutionY, resolutionX);
    }

	@Override
	public Model getModel()
	{
		return m_model;
	}
}
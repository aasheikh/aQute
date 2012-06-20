package aQute.poma.wire;

import com.vaadin.annotations.*;
import com.vaadin.ui.*;

public class WireForm extends CustomComponent {
	private static final long	serialVersionUID	= 1L;
	@AutoGenerated
	private AbsoluteLayout		mainLayout;
	@AutoGenerated
	private TextField			accountName;
	@AutoGenerated
	private Label				lName;
	@AutoGenerated
	private TextField			ibanNumber;
	@AutoGenerated
	private Label				lIBAN;

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/**
	 * The constructor should first build the main layout, set the composition
	 * root and then do any custom initialization. The constructor will not be
	 * automatically regenerated by the visual editor.
	 */
	public WireForm() {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		accountName.setImmediate(true);
	}

	public String getIBAN() {
		return (String) ibanNumber.getValue();
	}

	@AutoGenerated
	private AbsoluteLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new AbsoluteLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("460px");
		mainLayout.setHeight("140px");
		mainLayout.setMargin(false);

		// top-level component properties
		setWidth("460px");
		setHeight("140px");

		// lIBAN
		lIBAN = new Label();
		lIBAN.setImmediate(false);
		lIBAN.setWidth("-1px");
		lIBAN.setHeight("-1px");
		lIBAN.setValue("IBAN");
		mainLayout.addComponent(lIBAN, "top:20.0px;left:20.0px;");

		// ccNumber
		ibanNumber = new TextField();
		ibanNumber.setImmediate(false);
		ibanNumber.setWidth("320px");
		ibanNumber.setHeight("-1px");
		ibanNumber.setSecret(false);
		mainLayout.addComponent(ibanNumber, "top:20.0px;left:120.0px;");

		// lName
		lName = new Label();
		lName.setImmediate(false);
		lName.setWidth("-1px");
		lName.setHeight("-1px");
		lName.setValue("Name");
		mainLayout.addComponent(lName, "top:62.0px;left:20.0px;");

		// ccName
		accountName = new TextField();
		accountName.setImmediate(false);
		accountName.setWidth("320px");
		accountName.setHeight("-1px");
		accountName.setSecret(false);
		mainLayout.addComponent(accountName, "top:60.0px;left:120.0px;");

		return mainLayout;
	}

	public String getName() {
		return (String) accountName.getValue();
	}

}

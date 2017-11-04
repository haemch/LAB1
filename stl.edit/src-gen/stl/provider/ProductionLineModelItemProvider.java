/**
 */
package stl.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import stl.ProductionLineModel;
import stl.StlFactory;
import stl.StlPackage;

/**
 * This is the item provider adapter for a {@link stl.ProductionLineModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductionLineModelItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductionLineModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(StlPackage.Literals.PRODUCTION_LINE_MODEL__ITEMTYPES);
			childrenFeatures.add(StlPackage.Literals.PRODUCTION_LINE_MODEL__AREA);
			childrenFeatures.add(StlPackage.Literals.PRODUCTION_LINE_MODEL__CONNECTORS);
			childrenFeatures.add(StlPackage.Literals.PRODUCTION_LINE_MODEL__COMPONENTS);
			childrenFeatures.add(StlPackage.Literals.PRODUCTION_LINE_MODEL__SLOTS);
			childrenFeatures.add(StlPackage.Literals.PRODUCTION_LINE_MODEL__SERVICE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ProductionLineModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProductionLineModel"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ProductionLineModel_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ProductionLineModel.class)) {
		case StlPackage.PRODUCTION_LINE_MODEL__ITEMTYPES:
		case StlPackage.PRODUCTION_LINE_MODEL__AREA:
		case StlPackage.PRODUCTION_LINE_MODEL__CONNECTORS:
		case StlPackage.PRODUCTION_LINE_MODEL__COMPONENTS:
		case StlPackage.PRODUCTION_LINE_MODEL__SLOTS:
		case StlPackage.PRODUCTION_LINE_MODEL__SERVICE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(StlPackage.Literals.PRODUCTION_LINE_MODEL__ITEMTYPES,
				StlFactory.eINSTANCE.createItemTypes()));

		newChildDescriptors.add(createChildParameter(StlPackage.Literals.PRODUCTION_LINE_MODEL__AREA,
				StlFactory.eINSTANCE.createArea()));

		newChildDescriptors.add(createChildParameter(StlPackage.Literals.PRODUCTION_LINE_MODEL__CONNECTORS,
				StlFactory.eINSTANCE.createConnectors()));

		newChildDescriptors.add(createChildParameter(StlPackage.Literals.PRODUCTION_LINE_MODEL__COMPONENTS,
				StlFactory.eINSTANCE.createItemGenerator()));

		newChildDescriptors.add(createChildParameter(StlPackage.Literals.PRODUCTION_LINE_MODEL__COMPONENTS,
				StlFactory.eINSTANCE.createConveyor()));

		newChildDescriptors.add(createChildParameter(StlPackage.Literals.PRODUCTION_LINE_MODEL__COMPONENTS,
				StlFactory.eINSTANCE.createTurntable()));

		newChildDescriptors.add(createChildParameter(StlPackage.Literals.PRODUCTION_LINE_MODEL__COMPONENTS,
				StlFactory.eINSTANCE.createMachine()));

		newChildDescriptors.add(createChildParameter(StlPackage.Literals.PRODUCTION_LINE_MODEL__COMPONENTS,
				StlFactory.eINSTANCE.createBuffer()));

		newChildDescriptors.add(createChildParameter(StlPackage.Literals.PRODUCTION_LINE_MODEL__COMPONENTS,
				StlFactory.eINSTANCE.createProductStore()));

		newChildDescriptors.add(createChildParameter(StlPackage.Literals.PRODUCTION_LINE_MODEL__COMPONENTS,
				StlFactory.eINSTANCE.createWasteStore()));

		newChildDescriptors.add(createChildParameter(StlPackage.Literals.PRODUCTION_LINE_MODEL__SLOTS,
				StlFactory.eINSTANCE.createInputSlot()));

		newChildDescriptors.add(createChildParameter(StlPackage.Literals.PRODUCTION_LINE_MODEL__SLOTS,
				StlFactory.eINSTANCE.createOutputSlot()));

		newChildDescriptors.add(createChildParameter(StlPackage.Literals.PRODUCTION_LINE_MODEL__SERVICE,
				StlFactory.eINSTANCE.createService()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return StlEditPlugin.INSTANCE;
	}

}

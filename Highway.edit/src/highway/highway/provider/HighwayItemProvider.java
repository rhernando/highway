/**
 */
package highway.highway.provider;


import highway.highway.Highway;
import highway.highway.HighwayFactory;
import highway.highway.HighwayPackage;

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

/**
 * This is the item provider adapter for a {@link highway.highway.Highway} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HighwayItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighwayItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(HighwayPackage.Literals.HIGHWAY__INIT_NODES);
			childrenFeatures.add(HighwayPackage.Literals.HIGHWAY__INIT_CARS);
			childrenFeatures.add(HighwayPackage.Literals.HIGHWAY__INIT_SEGMENTS);
			childrenFeatures.add(HighwayPackage.Literals.HIGHWAY__INIT_SEMAPHORE);
			childrenFeatures.add(HighwayPackage.Literals.HIGHWAY__INIT_SIGNAL);
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
	 * This returns Highway.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Highway"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Highway_type");
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

		switch (notification.getFeatureID(Highway.class)) {
			case HighwayPackage.HIGHWAY__INIT_NODES:
			case HighwayPackage.HIGHWAY__INIT_CARS:
			case HighwayPackage.HIGHWAY__INIT_SEGMENTS:
			case HighwayPackage.HIGHWAY__INIT_SEMAPHORE:
			case HighwayPackage.HIGHWAY__INIT_SIGNAL:
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

		newChildDescriptors.add
			(createChildParameter
				(HighwayPackage.Literals.HIGHWAY__INIT_NODES,
				 HighwayFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(HighwayPackage.Literals.HIGHWAY__INIT_NODES,
				 HighwayFactory.eINSTANCE.createExtractor()));

		newChildDescriptors.add
			(createChildParameter
				(HighwayPackage.Literals.HIGHWAY__INIT_NODES,
				 HighwayFactory.eINSTANCE.createInjector()));

		newChildDescriptors.add
			(createChildParameter
				(HighwayPackage.Literals.HIGHWAY__INIT_CARS,
				 HighwayFactory.eINSTANCE.createCar()));

		newChildDescriptors.add
			(createChildParameter
				(HighwayPackage.Literals.HIGHWAY__INIT_SEGMENTS,
				 HighwayFactory.eINSTANCE.createSegment()));

		newChildDescriptors.add
			(createChildParameter
				(HighwayPackage.Literals.HIGHWAY__INIT_SEMAPHORE,
				 HighwayFactory.eINSTANCE.createSemaphore()));

		newChildDescriptors.add
			(createChildParameter
				(HighwayPackage.Literals.HIGHWAY__INIT_SIGNAL,
				 HighwayFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(HighwayPackage.Literals.HIGHWAY__INIT_SIGNAL,
				 HighwayFactory.eINSTANCE.createSpeedlimit()));

		newChildDescriptors.add
			(createChildParameter
				(HighwayPackage.Literals.HIGHWAY__INIT_SIGNAL,
				 HighwayFactory.eINSTANCE.createStop()));

		newChildDescriptors.add
			(createChildParameter
				(HighwayPackage.Literals.HIGHWAY__INIT_SIGNAL,
				 HighwayFactory.eINSTANCE.createYield()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return HighwayEditPlugin.INSTANCE;
	}

}

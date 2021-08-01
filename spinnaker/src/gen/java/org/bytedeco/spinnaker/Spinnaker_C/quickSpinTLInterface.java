// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.spinnaker.Spinnaker_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.spinnaker.global.Spinnaker_C.*;


/**	
* \defgroup TLInterfaceC_h TLInterface Structures
* \ingroup CQuickSpin
*/
/*@{*/

@Properties(inherit = org.bytedeco.spinnaker.presets.Spinnaker_C.class)
public class quickSpinTLInterface extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public quickSpinTLInterface() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public quickSpinTLInterface(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public quickSpinTLInterface(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public quickSpinTLInterface position(long position) {
        return (quickSpinTLInterface)super.position(position);
    }
    @Override public quickSpinTLInterface getPointer(long i) {
        return new quickSpinTLInterface((Pointer)this).offsetAddress(i);
    }

	public native @Cast("quickSpinStringNode") spinNodeHandle InterfaceID(); public native quickSpinTLInterface InterfaceID(spinNodeHandle setter);
	public native @Cast("quickSpinStringNode") spinNodeHandle InterfaceDisplayName(); public native quickSpinTLInterface InterfaceDisplayName(spinNodeHandle setter);
	public native @Cast("quickSpinEnumerationNode") spinNodeHandle InterfaceType(); public native quickSpinTLInterface InterfaceType(spinNodeHandle setter);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevInterfaceGatewaySelector(); public native quickSpinTLInterface GevInterfaceGatewaySelector(spinNodeHandle setter);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevInterfaceGateway(); public native quickSpinTLInterface GevInterfaceGateway(spinNodeHandle setter);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevInterfaceMACAddress(); public native quickSpinTLInterface GevInterfaceMACAddress(spinNodeHandle setter);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevInterfaceSubnetSelector(); public native quickSpinTLInterface GevInterfaceSubnetSelector(spinNodeHandle setter);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevInterfaceSubnetIPAddress(); public native quickSpinTLInterface GevInterfaceSubnetIPAddress(spinNodeHandle setter);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevInterfaceSubnetMask(); public native quickSpinTLInterface GevInterfaceSubnetMask(spinNodeHandle setter);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevInterfaceTransmitLinkSpeed(); public native quickSpinTLInterface GevInterfaceTransmitLinkSpeed(spinNodeHandle setter);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevInterfaceReceiveLinkSpeed(); public native quickSpinTLInterface GevInterfaceReceiveLinkSpeed(spinNodeHandle setter);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevInterfaceMTU(); public native quickSpinTLInterface GevInterfaceMTU(spinNodeHandle setter);
	public native @Cast("quickSpinEnumerationNode") spinNodeHandle POEStatus(); public native quickSpinTLInterface POEStatus(spinNodeHandle setter);
	public native @Cast("quickSpinEnumerationNode") spinNodeHandle FilterDriverStatus(); public native quickSpinTLInterface FilterDriverStatus(spinNodeHandle setter);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevActionDeviceKey(); public native quickSpinTLInterface GevActionDeviceKey(spinNodeHandle setter);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevActionGroupKey(); public native quickSpinTLInterface GevActionGroupKey(spinNodeHandle setter);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevActionGroupMask(); public native quickSpinTLInterface GevActionGroupMask(spinNodeHandle setter);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevActionTime(); public native quickSpinTLInterface GevActionTime(spinNodeHandle setter);
	public native @Cast("quickSpinCommandNode") spinNodeHandle ActionCommand(); public native quickSpinTLInterface ActionCommand(spinNodeHandle setter);
	public native @Cast("quickSpinStringNode") spinNodeHandle DeviceUnlock(); public native quickSpinTLInterface DeviceUnlock(spinNodeHandle setter);
	public native @Cast("quickSpinCommandNode") spinNodeHandle DeviceUpdateList(); public native quickSpinTLInterface DeviceUpdateList(spinNodeHandle setter);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle DeviceCount(); public native quickSpinTLInterface DeviceCount(spinNodeHandle setter);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle DeviceSelector(); public native quickSpinTLInterface DeviceSelector(spinNodeHandle setter);
	public native @Cast("quickSpinStringNode") spinNodeHandle DeviceID(); public native quickSpinTLInterface DeviceID(spinNodeHandle setter);
	public native @Cast("quickSpinStringNode") spinNodeHandle DeviceVendorName(); public native quickSpinTLInterface DeviceVendorName(spinNodeHandle setter);
	public native @Cast("quickSpinStringNode") spinNodeHandle DeviceModelName(); public native quickSpinTLInterface DeviceModelName(spinNodeHandle setter);
	public native @Cast("quickSpinStringNode") spinNodeHandle DeviceSerialNumber(); public native quickSpinTLInterface DeviceSerialNumber(spinNodeHandle setter);
	public native @Cast("quickSpinEnumerationNode") spinNodeHandle DeviceAccessStatus(); public native quickSpinTLInterface DeviceAccessStatus(spinNodeHandle setter);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevDeviceIPAddress(); public native quickSpinTLInterface GevDeviceIPAddress(spinNodeHandle setter);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevDeviceSubnetMask(); public native quickSpinTLInterface GevDeviceSubnetMask(spinNodeHandle setter);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevDeviceGateway(); public native quickSpinTLInterface GevDeviceGateway(spinNodeHandle setter);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevDeviceMACAddress(); public native quickSpinTLInterface GevDeviceMACAddress(spinNodeHandle setter);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle IncompatibleDeviceCount(); public native quickSpinTLInterface IncompatibleDeviceCount(spinNodeHandle setter);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle IncompatibleDeviceSelector(); public native quickSpinTLInterface IncompatibleDeviceSelector(spinNodeHandle setter);
	public native @Cast("quickSpinStringNode") spinNodeHandle IncompatibleDeviceID(); public native quickSpinTLInterface IncompatibleDeviceID(spinNodeHandle setter);
	public native @Cast("quickSpinStringNode") spinNodeHandle IncompatibleDeviceVendorName(); public native quickSpinTLInterface IncompatibleDeviceVendorName(spinNodeHandle setter);
	public native @Cast("quickSpinStringNode") spinNodeHandle IncompatibleDeviceModelName(); public native quickSpinTLInterface IncompatibleDeviceModelName(spinNodeHandle setter);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle IncompatibleGevDeviceIPAddress(); public native quickSpinTLInterface IncompatibleGevDeviceIPAddress(spinNodeHandle setter);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle IncompatibleGevDeviceSubnetMask(); public native quickSpinTLInterface IncompatibleGevDeviceSubnetMask(spinNodeHandle setter);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle IncompatibleGevDeviceMACAddress(); public native quickSpinTLInterface IncompatibleGevDeviceMACAddress(spinNodeHandle setter);
	public native @Cast("quickSpinCommandNode") spinNodeHandle GevDeviceForceIP(); public native quickSpinTLInterface GevDeviceForceIP(spinNodeHandle setter);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevDeviceForceIPAddress(); public native quickSpinTLInterface GevDeviceForceIPAddress(spinNodeHandle setter);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevDeviceForceSubnetMask(); public native quickSpinTLInterface GevDeviceForceSubnetMask(spinNodeHandle setter);
	public native @Cast("quickSpinIntegerNode") spinNodeHandle GevDeviceForceGateway(); public native quickSpinTLInterface GevDeviceForceGateway(spinNodeHandle setter);
	public native @Cast("quickSpinCommandNode") spinNodeHandle GevDeviceAutoForceIP(); public native quickSpinTLInterface GevDeviceAutoForceIP(spinNodeHandle setter);
	public native @Cast("quickSpinStringNode") spinNodeHandle HostAdapterName(); public native quickSpinTLInterface HostAdapterName(spinNodeHandle setter);
	public native @Cast("quickSpinStringNode") spinNodeHandle HostAdapterVendor(); public native quickSpinTLInterface HostAdapterVendor(spinNodeHandle setter);
	public native @Cast("quickSpinStringNode") spinNodeHandle HostAdapterDriverVersion(); public native quickSpinTLInterface HostAdapterDriverVersion(spinNodeHandle setter);
}

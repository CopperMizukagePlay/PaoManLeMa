package p039e5;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbManager;
import java.util.HashSet;
import java.util.Set;
import p053g5.C1689h;
import p060h5.AbstractC1793a0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.fu */
/* loaded from: classes.dex */
public final class C0884fu {

    /* renamed from: c */
    public static volatile String f4094c;

    /* renamed from: d */
    public static volatile String f4095d;

    /* renamed from: e */
    public static volatile int f4096e;

    /* renamed from: f */
    public static volatile long f4097f;

    /* renamed from: g */
    public static volatile boolean f4098g;

    /* renamed from: a */
    public static final C0884fu f4092a = new Object();

    /* renamed from: b */
    public static final Set f4093b = AbstractC1793a0.m2971K(3034, 2965, 3574, 6121, 1060, 9047, 5041, 11978, 1256, 4070, 38672);

    /* renamed from: h */
    public static final HashSet f4099h = new HashSet();

    /* renamed from: a */
    public static C0820du m1547a(UsbManager usbManager, UsbDevice usbDevice) {
        Object m2985m;
        try {
            m2985m = usbManager.openDevice(usbDevice);
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        if (m2985m instanceof C1689h) {
            m2985m = null;
        }
        UsbDeviceConnection usbDeviceConnection = (UsbDeviceConnection) m2985m;
        if (usbDeviceConnection != null) {
            try {
                try {
                    byte[] rawDescriptors = usbDeviceConnection.getRawDescriptors();
                    if (rawDescriptors != null && rawDescriptors.length >= 4) {
                        int i7 = (rawDescriptors[2] & 255) | ((rawDescriptors[3] & 255) << 8);
                        C0820du m1548b = m1548b(i7);
                        int i8 = m1548b.f3577a;
                        String str = m1548b.f3578b;
                        String str2 = m1548b.f3579c;
                        AbstractC3367j.m5100e(str, "label");
                        AbstractC3367j.m5100e(str2, "shortLabel");
                        C0820du c0820du = new C0820du(i8, i7, str, str2);
                        try {
                            usbDeviceConnection.close();
                        } catch (Throwable th2) {
                            AbstractC1793a0.m2985m(th2);
                        }
                        return c0820du;
                    }
                    try {
                        usbDeviceConnection.close();
                    } catch (Throwable th3) {
                        AbstractC1793a0.m2985m(th3);
                    }
                } catch (Throwable unused) {
                    usbDeviceConnection.close();
                    return null;
                }
            } catch (Throwable th4) {
                AbstractC1793a0.m2985m(th4);
                return null;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C0820du m1548b(int i7) {
        if (i7 >= 800) {
            return new C0820du(0, 0, "USB3.2（代际）", "USB3.2");
        }
        if (i7 >= 784) {
            return new C0820du(0, 0, "USB3.1（代际）", "USB3.1");
        }
        if (i7 >= 768) {
            return new C0820du(0, 0, "USB3.0（代际）", "USB3.0");
        }
        if (i7 >= 512) {
            return new C0820du(480, 0, "USB2.0 总线 480 Mbps（代际上限）", "USB2.0 480 Mbps");
        }
        if (i7 >= 272) {
            return new C0820du(12, 0, "USB1.1 总线 12 Mbps（代际上限）", "USB1.1 12 Mbps");
        }
        return new C0820du(12, 0, "USB1.0 总线 12 Mbps（代际上限）", "USB1.0 12 Mbps");
    }
}

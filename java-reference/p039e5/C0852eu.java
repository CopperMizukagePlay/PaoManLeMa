package p039e5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.os.Build;
import p008b.AbstractC0223b;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.eu */
/* loaded from: classes.dex */
public final class C0852eu extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        UsbManager usbManager;
        UsbDevice usbDevice;
        AbstractC3367j.m5100e(context, "ctx");
        AbstractC3367j.m5100e(intent, "intent");
        if (AbstractC3367j.m5096a(intent.getAction(), "com.paoman.lema.action.USB_PERMISSION") && intent.getBooleanExtra("permission", false)) {
            Object systemService = context.getApplicationContext().getSystemService("usb");
            if (systemService instanceof UsbManager) {
                usbManager = (UsbManager) systemService;
            } else {
                usbManager = null;
            }
            if (usbManager != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    usbDevice = (UsbDevice) AbstractC0223b.m496n(intent);
                } else {
                    usbDevice = (UsbDevice) intent.getParcelableExtra("device");
                }
                if (usbDevice != null) {
                    C0884fu c0884fu = C0884fu.f4092a;
                    C0820du m1547a = C0884fu.m1547a(usbManager, usbDevice);
                    if (m1547a != null) {
                        if (m1547a.f3580d <= C0884fu.f4096e && C0884fu.f4094c != null) {
                            return;
                        }
                        C0884fu.f4096e = m1547a.f3580d;
                        C0884fu.f4094c = m1547a.f3578b;
                        C0884fu.f4095d = m1547a.f3579c;
                    }
                }
            }
        }
    }
}

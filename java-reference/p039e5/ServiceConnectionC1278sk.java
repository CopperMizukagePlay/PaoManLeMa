package p039e5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import p060h5.AbstractC1793a0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.sk */
/* loaded from: classes.dex */
public final class ServiceConnectionC1278sk implements ServiceConnection {

    /* renamed from: a */
    public final String f7615a;

    /* renamed from: b */
    public final Class f7616b;

    /* renamed from: c */
    public final int f7617c;

    /* renamed from: d */
    public final Bundle f7618d;

    /* renamed from: e */
    public Messenger f7619e;

    /* renamed from: f */
    public final /* synthetic */ C1340uk f7620f;

    public ServiceConnectionC1278sk(C1340uk c1340uk, String str, Class cls, int i7, Bundle bundle) {
        AbstractC3367j.m5100e(str, "targetId");
        AbstractC3367j.m5100e(cls, "serviceClass");
        this.f7620f = c1340uk;
        this.f7615a = str;
        this.f7616b = cls;
        this.f7617c = i7;
        this.f7618d = bundle;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C1340uk c1340uk = this.f7620f;
        int i7 = c1340uk.f7972q;
        Context context = c1340uk.f7956a;
        int i8 = this.f7617c;
        if (i8 != i7) {
            try {
                context.unbindService(this);
            } catch (Throwable th) {
                AbstractC1793a0.m2985m(th);
            }
            try {
                context.stopService(new Intent(context, (Class<?>) this.f7616b));
                return;
            } catch (Throwable th2) {
                AbstractC1793a0.m2985m(th2);
                return;
            }
        }
        Messenger messenger = new Messenger(iBinder);
        this.f7619e = messenger;
        Message obtain = Message.obtain((Handler) null, 1);
        obtain.replyTo = c1340uk.f7973r;
        Bundle bundle = new Bundle(this.f7618d);
        bundle.putString("target_id", this.f7615a);
        bundle.putInt("run_token", i8);
        obtain.setData(bundle);
        try {
            messenger.send(obtain);
        } catch (Throwable th3) {
            AbstractC1793a0.m2985m(th3);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f7619e = null;
        C1340uk.m2363a(this.f7620f);
    }
}

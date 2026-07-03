package p170w1;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import p047f6.C1548c;
import p053g5.C1694m;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.p2 */
/* loaded from: classes.dex */
public final class C3715p2 extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ C1548c f17661a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3715p2(C1548c c1548c, Handler handler) {
        super(handler);
        this.f17661a = c1548c;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z7, Uri uri) {
        this.f17661a.mo2505v(C1694m.f10482a);
    }
}

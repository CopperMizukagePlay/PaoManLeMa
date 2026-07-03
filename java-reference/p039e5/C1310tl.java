package p039e5;

import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import p024c6.AbstractC0444k;
import p099m6.AbstractC2595c;
import p099m6.InterfaceC2608i0;
import p158u5.AbstractC3367j;
import p158u5.C3379v;
import p196z6.C3887f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.tl */
/* loaded from: classes.dex */
public final class C1310tl extends AbstractC2595c {

    /* renamed from: a */
    public final /* synthetic */ C3379v f7828a;

    /* renamed from: b */
    public final /* synthetic */ CountDownLatch f7829b;

    public C1310tl(C3379v c3379v, C1403wl c1403wl, CountDownLatch countDownLatch) {
        this.f7828a = c3379v;
        this.f7829b = countDownLatch;
    }

    @Override // p099m6.AbstractC2595c
    /* renamed from: l */
    public final void mo2349l(C3887f c3887f, Exception exc) {
        this.f7829b.countDown();
    }

    @Override // p099m6.AbstractC2595c
    /* renamed from: m */
    public final void mo2350m(InterfaceC2608i0 interfaceC2608i0, String str) {
        AbstractC3367j.m5100e(interfaceC2608i0, "webSocket");
        if (AbstractC0444k.m937a0(str)) {
            return;
        }
        this.f7828a.f16451e = C1403wl.m2382h(new JSONObject(str));
        this.f7829b.countDown();
    }
}

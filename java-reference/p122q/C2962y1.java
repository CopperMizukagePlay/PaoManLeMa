package p122q;

import p006a7.InterfaceC0128k;
import p024c6.AbstractC0444k;
import p039e5.C0811dk;
import p099m6.C2617r;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.y1 */
/* loaded from: classes.dex */
public final class C2962y1 {

    /* renamed from: a */
    public long f15359a;

    /* renamed from: b */
    public final Object f15360b;

    public C2962y1(InterfaceC0128k interfaceC0128k) {
        AbstractC3367j.m5100e(interfaceC0128k, "source");
        this.f15360b = interfaceC0128k;
        this.f15359a = 262144L;
    }

    /* renamed from: a */
    public C2617r m4602a() {
        C0811dk c0811dk = new C0811dk(3);
        while (true) {
            String mo271x = ((InterfaceC0128k) this.f15360b).mo271x(this.f15359a);
            this.f15359a -= mo271x.length();
            if (mo271x.length() == 0) {
                return c0811dk.m1504e();
            }
            int m934X = AbstractC0444k.m934X(mo271x, ':', 1, 4);
            if (m934X != -1) {
                String substring = mo271x.substring(0, m934X);
                AbstractC3367j.m5099d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = mo271x.substring(m934X + 1);
                AbstractC3367j.m5099d(substring2, "this as java.lang.String).substring(startIndex)");
                c0811dk.m1502b(substring, substring2);
            } else if (mo271x.charAt(0) == ':') {
                String substring3 = mo271x.substring(1);
                AbstractC3367j.m5099d(substring3, "this as java.lang.String).substring(startIndex)");
                c0811dk.m1502b("", substring3);
            } else {
                c0811dk.m1502b("", mo271x);
            }
        }
    }

    public C2962y1(EnumC2931o0 enumC2931o0) {
        this.f15360b = enumC2931o0;
        this.f15359a = 0L;
    }
}

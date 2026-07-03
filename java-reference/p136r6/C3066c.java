package p136r6;

import android.os.Looper;
import android.view.Choreographer;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import p068i5.AbstractC2080d;
import p106n6.AbstractC2721b;
import p170w1.C3694k1;
import p170w1.C3717q0;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r6.c */
/* loaded from: classes.dex */
public final class C3066c extends ThreadLocal {

    /* renamed from: a */
    public final /* synthetic */ int f15661a;

    public /* synthetic */ C3066c(int i7) {
        this.f15661a = i7;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f15661a) {
            case 0:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(AbstractC2721b.f14573e);
                return simpleDateFormat;
            case 1:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    C3717q0 c3717q0 = new C3717q0(choreographer, AbstractC3784a.m5801e(myLooper));
                    return AbstractC2080d.m3374B(c3717q0, c3717q0.f17674p);
                }
                throw new IllegalStateException("no Looper on this thread");
            case 2:
                return new C3694k1();
            default:
                return new Random();
        }
    }
}

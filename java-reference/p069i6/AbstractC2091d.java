package p069i6;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;
import p015b6.AbstractC0307n;
import p040e6.C1506b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i6.d */
/* loaded from: classes.dex */
public abstract class AbstractC2091d {

    /* renamed from: a */
    public static final List f12350a;

    static {
        try {
            f12350a = AbstractC0307n.m668G(AbstractC0307n.m664C(Arrays.asList(new C1506b()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}

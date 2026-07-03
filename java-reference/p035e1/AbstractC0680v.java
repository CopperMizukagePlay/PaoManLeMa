package p035e1;

import android.graphics.ColorSpace;
import android.os.Build;
import java.util.function.DoubleUnaryOperator;
import p042f1.AbstractC1516c;
import p042f1.C1517d;
import p042f1.C1529p;
import p042f1.C1530q;
import p042f1.C1531r;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e1.v */
/* loaded from: classes.dex */
public abstract class AbstractC0680v {
    /* renamed from: a */
    public static final ColorSpace m1462a(AbstractC1516c abstractC1516c) {
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        ColorSpace.Named named;
        ColorSpace.Named named2;
        if (AbstractC3367j.m5096a(abstractC1516c, C1517d.f10019e)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (AbstractC3367j.m5096a(abstractC1516c, C1517d.f10031q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (AbstractC3367j.m5096a(abstractC1516c, C1517d.f10032r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (AbstractC3367j.m5096a(abstractC1516c, C1517d.f10029o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (AbstractC3367j.m5096a(abstractC1516c, C1517d.f10024j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (AbstractC3367j.m5096a(abstractC1516c, C1517d.f10023i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (AbstractC3367j.m5096a(abstractC1516c, C1517d.f10034t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (AbstractC3367j.m5096a(abstractC1516c, C1517d.f10033s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (AbstractC3367j.m5096a(abstractC1516c, C1517d.f10025k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (AbstractC3367j.m5096a(abstractC1516c, C1517d.f10026l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (AbstractC3367j.m5096a(abstractC1516c, C1517d.f10021g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (AbstractC3367j.m5096a(abstractC1516c, C1517d.f10022h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (AbstractC3367j.m5096a(abstractC1516c, C1517d.f10020f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (AbstractC3367j.m5096a(abstractC1516c, C1517d.f10027m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (AbstractC3367j.m5096a(abstractC1516c, C1517d.f10030p)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else if (AbstractC3367j.m5096a(abstractC1516c, C1517d.f10028n)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        } else {
            ColorSpace.Rgb.TransferParameters transferParameters = null;
            if (Build.VERSION.SDK_INT >= 34) {
                if (AbstractC3367j.m5096a(abstractC1516c, C1517d.f10036v)) {
                    named2 = ColorSpace.Named.BT2020_HLG;
                    colorSpace2 = ColorSpace.get(named2);
                } else if (AbstractC3367j.m5096a(abstractC1516c, C1517d.f10037w)) {
                    named = ColorSpace.Named.BT2020_PQ;
                    colorSpace2 = ColorSpace.get(named);
                } else {
                    colorSpace2 = null;
                }
                if (colorSpace2 != null) {
                    return colorSpace2;
                }
            }
            if (abstractC1516c instanceof C1530q) {
                String str = abstractC1516c.f10012a;
                C1530q c1530q = (C1530q) abstractC1516c;
                float[] m2462a = c1530q.f10067d.m2462a();
                C1531r c1531r = c1530q.f10070g;
                if (c1531r != null) {
                    transferParameters = new ColorSpace.Rgb.TransferParameters(c1531r.f10082b, c1531r.f10083c, c1531r.f10084d, c1531r.f10085e, c1531r.f10086f, c1531r.f10087g, c1531r.f10081a);
                }
                if (transferParameters != null) {
                    return new ColorSpace.Rgb(str, c1530q.f10071h, m2462a, transferParameters);
                }
                float[] fArr = c1530q.f10071h;
                final C1529p c1529p = c1530q.f10075l;
                final int i7 = 0;
                DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: e1.u
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d7) {
                        switch (i7) {
                            case 0:
                                return ((Number) c1529p.mo23f(Double.valueOf(d7))).doubleValue();
                            default:
                                return ((Number) c1529p.mo23f(Double.valueOf(d7))).doubleValue();
                        }
                    }
                };
                final C1529p c1529p2 = c1530q.f10078o;
                final int i8 = 1;
                return new ColorSpace.Rgb(str, fArr, m2462a, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: e1.u
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d7) {
                        switch (i8) {
                            case 0:
                                return ((Number) c1529p2.mo23f(Double.valueOf(d7))).doubleValue();
                            default:
                                return ((Number) c1529p2.mo23f(Double.valueOf(d7))).doubleValue();
                        }
                    }
                }, c1530q.f10068e, c1530q.f10069f);
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        return colorSpace;
    }
}


package org.onvif.ver10.schema;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.onvif.ver10.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _VideoSourceConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "VideoSourceConfiguration");
    private final static QName _AudioSourceConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "AudioSourceConfiguration");
    private final static QName _VideoEncoderConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "VideoEncoderConfiguration");
    private final static QName _AudioEncoderConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "AudioEncoderConfiguration");
    private final static QName _VideoAnalyticsConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "VideoAnalyticsConfiguration");
    private final static QName _PTZConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "PTZConfiguration");
    private final static QName _MetadataConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "MetadataConfiguration");
    private final static QName _AudioOutputConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "AudioOutputConfiguration");
    private final static QName _AudioDecoderConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "AudioDecoderConfiguration");
    private final static QName _Polygon_QNAME = new QName("http://www.onvif.org/ver10/schema", "Polygon");
    private final static QName _Polyline_QNAME = new QName("http://www.onvif.org/ver10/schema", "Polyline");
    private final static QName _MetadataStream_QNAME = new QName("http://www.onvif.org/ver10/schema", "MetadataStream");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.onvif.ver10.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConfigDescription }
     * 
     */
    public ConfigDescription createConfigDescription() {
        return new ConfigDescription();
    }

    /**
     * Create an instance of {@link Behaviour }
     * 
     */
    public Behaviour createBehaviour() {
        return new Behaviour();
    }

    /**
     * Create an instance of {@link ClassDescriptor }
     * 
     */
    public ClassDescriptor createClassDescriptor() {
        return new ClassDescriptor();
    }

    /**
     * Create an instance of {@link ColorDescriptor }
     * 
     */
    public ColorDescriptor createColorDescriptor() {
        return new ColorDescriptor();
    }

    /**
     * Create an instance of {@link ItemListDescription }
     * 
     */
    public ItemListDescription createItemListDescription() {
        return new ItemListDescription();
    }

    /**
     * Create an instance of {@link EventSubscription }
     * 
     */
    public EventSubscription createEventSubscription() {
        return new EventSubscription();
    }

    /**
     * Create an instance of {@link ItemList }
     * 
     */
    public ItemList createItemList() {
        return new ItemList();
    }

    /**
     * Create an instance of {@link VideoSourceConfiguration }
     * 
     */
    public VideoSourceConfiguration createVideoSourceConfiguration() {
        return new VideoSourceConfiguration();
    }

    /**
     * Create an instance of {@link AudioSourceConfiguration }
     * 
     */
    public AudioSourceConfiguration createAudioSourceConfiguration() {
        return new AudioSourceConfiguration();
    }

    /**
     * Create an instance of {@link VideoEncoderConfiguration }
     * 
     */
    public VideoEncoderConfiguration createVideoEncoderConfiguration() {
        return new VideoEncoderConfiguration();
    }

    /**
     * Create an instance of {@link AudioEncoderConfiguration }
     * 
     */
    public AudioEncoderConfiguration createAudioEncoderConfiguration() {
        return new AudioEncoderConfiguration();
    }

    /**
     * Create an instance of {@link VideoAnalyticsConfiguration }
     * 
     */
    public VideoAnalyticsConfiguration createVideoAnalyticsConfiguration() {
        return new VideoAnalyticsConfiguration();
    }

    /**
     * Create an instance of {@link PTZConfiguration }
     * 
     */
    public PTZConfiguration createPTZConfiguration() {
        return new PTZConfiguration();
    }

    /**
     * Create an instance of {@link MetadataConfiguration }
     * 
     */
    public MetadataConfiguration createMetadataConfiguration() {
        return new MetadataConfiguration();
    }

    /**
     * Create an instance of {@link AudioOutputConfiguration }
     * 
     */
    public AudioOutputConfiguration createAudioOutputConfiguration() {
        return new AudioOutputConfiguration();
    }

    /**
     * Create an instance of {@link AudioDecoderConfiguration }
     * 
     */
    public AudioDecoderConfiguration createAudioDecoderConfiguration() {
        return new AudioDecoderConfiguration();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link MessageExtension }
     * 
     */
    public MessageExtension createMessageExtension() {
        return new MessageExtension();
    }

    /**
     * Create an instance of {@link Polygon }
     * 
     */
    public Polygon createPolygon() {
        return new Polygon();
    }

    /**
     * Create an instance of {@link Polyline }
     * 
     */
    public Polyline createPolyline() {
        return new Polyline();
    }

    /**
     * Create an instance of {@link MetadataStream }
     * 
     */
    public MetadataStream createMetadataStream() {
        return new MetadataStream();
    }

    /**
     * Create an instance of {@link DeviceEntity }
     * 
     */
    public DeviceEntity createDeviceEntity() {
        return new DeviceEntity();
    }

    /**
     * Create an instance of {@link IntRectangle }
     * 
     */
    public IntRectangle createIntRectangle() {
        return new IntRectangle();
    }

    /**
     * Create an instance of {@link IntRectangleRange }
     * 
     */
    public IntRectangleRange createIntRectangleRange() {
        return new IntRectangleRange();
    }

    /**
     * Create an instance of {@link IntRange }
     * 
     */
    public IntRange createIntRange() {
        return new IntRange();
    }

    /**
     * Create an instance of {@link FloatRange }
     * 
     */
    public FloatRange createFloatRange() {
        return new FloatRange();
    }

    /**
     * Create an instance of {@link DurationRange }
     * 
     */
    public DurationRange createDurationRange() {
        return new DurationRange();
    }

    /**
     * Create an instance of {@link IntList }
     * 
     */
    public IntList createIntList() {
        return new IntList();
    }

    /**
     * Create an instance of {@link FloatList }
     * 
     */
    public FloatList createFloatList() {
        return new FloatList();
    }

    /**
     * Create an instance of {@link AnyHolder }
     * 
     */
    public AnyHolder createAnyHolder() {
        return new AnyHolder();
    }

    /**
     * Create an instance of {@link VideoSource }
     * 
     */
    public VideoSource createVideoSource() {
        return new VideoSource();
    }

    /**
     * Create an instance of {@link VideoSourceExtension }
     * 
     */
    public VideoSourceExtension createVideoSourceExtension() {
        return new VideoSourceExtension();
    }

    /**
     * Create an instance of {@link VideoSourceExtension2 }
     * 
     */
    public VideoSourceExtension2 createVideoSourceExtension2() {
        return new VideoSourceExtension2();
    }

    /**
     * Create an instance of {@link AudioSource }
     * 
     */
    public AudioSource createAudioSource() {
        return new AudioSource();
    }

    /**
     * Create an instance of {@link Profile }
     * 
     */
    public Profile createProfile() {
        return new Profile();
    }

    /**
     * Create an instance of {@link ProfileExtension }
     * 
     */
    public ProfileExtension createProfileExtension() {
        return new ProfileExtension();
    }

    /**
     * Create an instance of {@link ProfileExtension2 }
     * 
     */
    public ProfileExtension2 createProfileExtension2() {
        return new ProfileExtension2();
    }

    /**
     * Create an instance of {@link ConfigurationEntity }
     * 
     */
    public ConfigurationEntity createConfigurationEntity() {
        return new ConfigurationEntity();
    }

    /**
     * Create an instance of {@link VideoSourceConfigurationExtension }
     * 
     */
    public VideoSourceConfigurationExtension createVideoSourceConfigurationExtension() {
        return new VideoSourceConfigurationExtension();
    }

    /**
     * Create an instance of {@link VideoSourceConfigurationExtension2 }
     * 
     */
    public VideoSourceConfigurationExtension2 createVideoSourceConfigurationExtension2() {
        return new VideoSourceConfigurationExtension2();
    }

    /**
     * Create an instance of {@link Rotate }
     * 
     */
    public Rotate createRotate() {
        return new Rotate();
    }

    /**
     * Create an instance of {@link RotateExtension }
     * 
     */
    public RotateExtension createRotateExtension() {
        return new RotateExtension();
    }

    /**
     * Create an instance of {@link LensProjection }
     * 
     */
    public LensProjection createLensProjection() {
        return new LensProjection();
    }

    /**
     * Create an instance of {@link LensOffset }
     * 
     */
    public LensOffset createLensOffset() {
        return new LensOffset();
    }

    /**
     * Create an instance of {@link LensDescription }
     * 
     */
    public LensDescription createLensDescription() {
        return new LensDescription();
    }

    /**
     * Create an instance of {@link VideoSourceConfigurationOptions }
     * 
     */
    public VideoSourceConfigurationOptions createVideoSourceConfigurationOptions() {
        return new VideoSourceConfigurationOptions();
    }

    /**
     * Create an instance of {@link VideoSourceConfigurationOptionsExtension }
     * 
     */
    public VideoSourceConfigurationOptionsExtension createVideoSourceConfigurationOptionsExtension() {
        return new VideoSourceConfigurationOptionsExtension();
    }

    /**
     * Create an instance of {@link VideoSourceConfigurationOptionsExtension2 }
     * 
     */
    public VideoSourceConfigurationOptionsExtension2 createVideoSourceConfigurationOptionsExtension2() {
        return new VideoSourceConfigurationOptionsExtension2();
    }

    /**
     * Create an instance of {@link RotateOptions }
     * 
     */
    public RotateOptions createRotateOptions() {
        return new RotateOptions();
    }

    /**
     * Create an instance of {@link RotateOptionsExtension }
     * 
     */
    public RotateOptionsExtension createRotateOptionsExtension() {
        return new RotateOptionsExtension();
    }

    /**
     * Create an instance of {@link VideoResolution }
     * 
     */
    public VideoResolution createVideoResolution() {
        return new VideoResolution();
    }

    /**
     * Create an instance of {@link VideoRateControl }
     * 
     */
    public VideoRateControl createVideoRateControl() {
        return new VideoRateControl();
    }

    /**
     * Create an instance of {@link Mpeg4Configuration }
     * 
     */
    public Mpeg4Configuration createMpeg4Configuration() {
        return new Mpeg4Configuration();
    }

    /**
     * Create an instance of {@link H264Configuration }
     * 
     */
    public H264Configuration createH264Configuration() {
        return new H264Configuration();
    }

    /**
     * Create an instance of {@link VideoEncoderConfigurationOptions }
     * 
     */
    public VideoEncoderConfigurationOptions createVideoEncoderConfigurationOptions() {
        return new VideoEncoderConfigurationOptions();
    }

    /**
     * Create an instance of {@link VideoEncoderOptionsExtension }
     * 
     */
    public VideoEncoderOptionsExtension createVideoEncoderOptionsExtension() {
        return new VideoEncoderOptionsExtension();
    }

    /**
     * Create an instance of {@link VideoEncoderOptionsExtension2 }
     * 
     */
    public VideoEncoderOptionsExtension2 createVideoEncoderOptionsExtension2() {
        return new VideoEncoderOptionsExtension2();
    }

    /**
     * Create an instance of {@link JpegOptions }
     * 
     */
    public JpegOptions createJpegOptions() {
        return new JpegOptions();
    }

    /**
     * Create an instance of {@link JpegOptions2 }
     * 
     */
    public JpegOptions2 createJpegOptions2() {
        return new JpegOptions2();
    }

    /**
     * Create an instance of {@link Mpeg4Options }
     * 
     */
    public Mpeg4Options createMpeg4Options() {
        return new Mpeg4Options();
    }

    /**
     * Create an instance of {@link Mpeg4Options2 }
     * 
     */
    public Mpeg4Options2 createMpeg4Options2() {
        return new Mpeg4Options2();
    }

    /**
     * Create an instance of {@link H264Options }
     * 
     */
    public H264Options createH264Options() {
        return new H264Options();
    }

    /**
     * Create an instance of {@link H264Options2 }
     * 
     */
    public H264Options2 createH264Options2() {
        return new H264Options2();
    }

    /**
     * Create an instance of {@link VideoEncoder2Configuration }
     * 
     */
    public VideoEncoder2Configuration createVideoEncoder2Configuration() {
        return new VideoEncoder2Configuration();
    }

    /**
     * Create an instance of {@link VideoResolution2 }
     * 
     */
    public VideoResolution2 createVideoResolution2() {
        return new VideoResolution2();
    }

    /**
     * Create an instance of {@link VideoRateControl2 }
     * 
     */
    public VideoRateControl2 createVideoRateControl2() {
        return new VideoRateControl2();
    }

    /**
     * Create an instance of {@link VideoEncoder2ConfigurationOptions }
     * 
     */
    public VideoEncoder2ConfigurationOptions createVideoEncoder2ConfigurationOptions() {
        return new VideoEncoder2ConfigurationOptions();
    }

    /**
     * Create an instance of {@link AudioSourceConfigurationOptions }
     * 
     */
    public AudioSourceConfigurationOptions createAudioSourceConfigurationOptions() {
        return new AudioSourceConfigurationOptions();
    }

    /**
     * Create an instance of {@link AudioSourceOptionsExtension }
     * 
     */
    public AudioSourceOptionsExtension createAudioSourceOptionsExtension() {
        return new AudioSourceOptionsExtension();
    }

    /**
     * Create an instance of {@link AudioEncoderConfigurationOptions }
     * 
     */
    public AudioEncoderConfigurationOptions createAudioEncoderConfigurationOptions() {
        return new AudioEncoderConfigurationOptions();
    }

    /**
     * Create an instance of {@link AudioEncoderConfigurationOption }
     * 
     */
    public AudioEncoderConfigurationOption createAudioEncoderConfigurationOption() {
        return new AudioEncoderConfigurationOption();
    }

    /**
     * Create an instance of {@link AudioEncoder2Configuration }
     * 
     */
    public AudioEncoder2Configuration createAudioEncoder2Configuration() {
        return new AudioEncoder2Configuration();
    }

    /**
     * Create an instance of {@link AudioEncoder2ConfigurationOptions }
     * 
     */
    public AudioEncoder2ConfigurationOptions createAudioEncoder2ConfigurationOptions() {
        return new AudioEncoder2ConfigurationOptions();
    }

    /**
     * Create an instance of {@link MetadataConfigurationExtension }
     * 
     */
    public MetadataConfigurationExtension createMetadataConfigurationExtension() {
        return new MetadataConfigurationExtension();
    }

    /**
     * Create an instance of {@link PTZFilter }
     * 
     */
    public PTZFilter createPTZFilter() {
        return new PTZFilter();
    }

    /**
     * Create an instance of {@link MetadataConfigurationOptions }
     * 
     */
    public MetadataConfigurationOptions createMetadataConfigurationOptions() {
        return new MetadataConfigurationOptions();
    }

    /**
     * Create an instance of {@link MetadataConfigurationOptionsExtension }
     * 
     */
    public MetadataConfigurationOptionsExtension createMetadataConfigurationOptionsExtension() {
        return new MetadataConfigurationOptionsExtension();
    }

    /**
     * Create an instance of {@link MetadataConfigurationOptionsExtension2 }
     * 
     */
    public MetadataConfigurationOptionsExtension2 createMetadataConfigurationOptionsExtension2() {
        return new MetadataConfigurationOptionsExtension2();
    }

    /**
     * Create an instance of {@link PTZStatusFilterOptions }
     * 
     */
    public PTZStatusFilterOptions createPTZStatusFilterOptions() {
        return new PTZStatusFilterOptions();
    }

    /**
     * Create an instance of {@link PTZStatusFilterOptionsExtension }
     * 
     */
    public PTZStatusFilterOptionsExtension createPTZStatusFilterOptionsExtension() {
        return new PTZStatusFilterOptionsExtension();
    }

    /**
     * Create an instance of {@link VideoOutput }
     * 
     */
    public VideoOutput createVideoOutput() {
        return new VideoOutput();
    }

    /**
     * Create an instance of {@link VideoOutputExtension }
     * 
     */
    public VideoOutputExtension createVideoOutputExtension() {
        return new VideoOutputExtension();
    }

    /**
     * Create an instance of {@link VideoOutputConfiguration }
     * 
     */
    public VideoOutputConfiguration createVideoOutputConfiguration() {
        return new VideoOutputConfiguration();
    }

    /**
     * Create an instance of {@link VideoOutputConfigurationOptions }
     * 
     */
    public VideoOutputConfigurationOptions createVideoOutputConfigurationOptions() {
        return new VideoOutputConfigurationOptions();
    }

    /**
     * Create an instance of {@link VideoDecoderConfigurationOptions }
     * 
     */
    public VideoDecoderConfigurationOptions createVideoDecoderConfigurationOptions() {
        return new VideoDecoderConfigurationOptions();
    }

    /**
     * Create an instance of {@link H264DecOptions }
     * 
     */
    public H264DecOptions createH264DecOptions() {
        return new H264DecOptions();
    }

    /**
     * Create an instance of {@link JpegDecOptions }
     * 
     */
    public JpegDecOptions createJpegDecOptions() {
        return new JpegDecOptions();
    }

    /**
     * Create an instance of {@link Mpeg4DecOptions }
     * 
     */
    public Mpeg4DecOptions createMpeg4DecOptions() {
        return new Mpeg4DecOptions();
    }

    /**
     * Create an instance of {@link VideoDecoderConfigurationOptionsExtension }
     * 
     */
    public VideoDecoderConfigurationOptionsExtension createVideoDecoderConfigurationOptionsExtension() {
        return new VideoDecoderConfigurationOptionsExtension();
    }

    /**
     * Create an instance of {@link AudioOutput }
     * 
     */
    public AudioOutput createAudioOutput() {
        return new AudioOutput();
    }

    /**
     * Create an instance of {@link AudioOutputConfigurationOptions }
     * 
     */
    public AudioOutputConfigurationOptions createAudioOutputConfigurationOptions() {
        return new AudioOutputConfigurationOptions();
    }

    /**
     * Create an instance of {@link AudioDecoderConfigurationOptions }
     * 
     */
    public AudioDecoderConfigurationOptions createAudioDecoderConfigurationOptions() {
        return new AudioDecoderConfigurationOptions();
    }

    /**
     * Create an instance of {@link G711DecOptions }
     * 
     */
    public G711DecOptions createG711DecOptions() {
        return new G711DecOptions();
    }

    /**
     * Create an instance of {@link AACDecOptions }
     * 
     */
    public AACDecOptions createAACDecOptions() {
        return new AACDecOptions();
    }

    /**
     * Create an instance of {@link G726DecOptions }
     * 
     */
    public G726DecOptions createG726DecOptions() {
        return new G726DecOptions();
    }

    /**
     * Create an instance of {@link AudioDecoderConfigurationOptionsExtension }
     * 
     */
    public AudioDecoderConfigurationOptionsExtension createAudioDecoderConfigurationOptionsExtension() {
        return new AudioDecoderConfigurationOptionsExtension();
    }

    /**
     * Create an instance of {@link MulticastConfiguration }
     * 
     */
    public MulticastConfiguration createMulticastConfiguration() {
        return new MulticastConfiguration();
    }

    /**
     * Create an instance of {@link StreamSetup }
     * 
     */
    public StreamSetup createStreamSetup() {
        return new StreamSetup();
    }

    /**
     * Create an instance of {@link Transport }
     * 
     */
    public Transport createTransport() {
        return new Transport();
    }

    /**
     * Create an instance of {@link MediaUri }
     * 
     */
    public MediaUri createMediaUri() {
        return new MediaUri();
    }

    /**
     * Create an instance of {@link Scope }
     * 
     */
    public Scope createScope() {
        return new Scope();
    }

    /**
     * Create an instance of {@link NetworkInterface }
     * 
     */
    public NetworkInterface createNetworkInterface() {
        return new NetworkInterface();
    }

    /**
     * Create an instance of {@link NetworkInterfaceExtension }
     * 
     */
    public NetworkInterfaceExtension createNetworkInterfaceExtension() {
        return new NetworkInterfaceExtension();
    }

    /**
     * Create an instance of {@link Dot3Configuration }
     * 
     */
    public Dot3Configuration createDot3Configuration() {
        return new Dot3Configuration();
    }

    /**
     * Create an instance of {@link NetworkInterfaceExtension2 }
     * 
     */
    public NetworkInterfaceExtension2 createNetworkInterfaceExtension2() {
        return new NetworkInterfaceExtension2();
    }

    /**
     * Create an instance of {@link NetworkInterfaceLink }
     * 
     */
    public NetworkInterfaceLink createNetworkInterfaceLink() {
        return new NetworkInterfaceLink();
    }

    /**
     * Create an instance of {@link NetworkInterfaceConnectionSetting }
     * 
     */
    public NetworkInterfaceConnectionSetting createNetworkInterfaceConnectionSetting() {
        return new NetworkInterfaceConnectionSetting();
    }

    /**
     * Create an instance of {@link NetworkInterfaceInfo }
     * 
     */
    public NetworkInterfaceInfo createNetworkInterfaceInfo() {
        return new NetworkInterfaceInfo();
    }

    /**
     * Create an instance of {@link IPv6NetworkInterface }
     * 
     */
    public IPv6NetworkInterface createIPv6NetworkInterface() {
        return new IPv6NetworkInterface();
    }

    /**
     * Create an instance of {@link IPv4NetworkInterface }
     * 
     */
    public IPv4NetworkInterface createIPv4NetworkInterface() {
        return new IPv4NetworkInterface();
    }

    /**
     * Create an instance of {@link IPv4Configuration }
     * 
     */
    public IPv4Configuration createIPv4Configuration() {
        return new IPv4Configuration();
    }

    /**
     * Create an instance of {@link IPv6Configuration }
     * 
     */
    public IPv6Configuration createIPv6Configuration() {
        return new IPv6Configuration();
    }

    /**
     * Create an instance of {@link IPv6ConfigurationExtension }
     * 
     */
    public IPv6ConfigurationExtension createIPv6ConfigurationExtension() {
        return new IPv6ConfigurationExtension();
    }

    /**
     * Create an instance of {@link NetworkProtocol }
     * 
     */
    public NetworkProtocol createNetworkProtocol() {
        return new NetworkProtocol();
    }

    /**
     * Create an instance of {@link NetworkProtocolExtension }
     * 
     */
    public NetworkProtocolExtension createNetworkProtocolExtension() {
        return new NetworkProtocolExtension();
    }

    /**
     * Create an instance of {@link NetworkHost }
     * 
     */
    public NetworkHost createNetworkHost() {
        return new NetworkHost();
    }

    /**
     * Create an instance of {@link NetworkHostExtension }
     * 
     */
    public NetworkHostExtension createNetworkHostExtension() {
        return new NetworkHostExtension();
    }

    /**
     * Create an instance of {@link IPAddress }
     * 
     */
    public IPAddress createIPAddress() {
        return new IPAddress();
    }

    /**
     * Create an instance of {@link PrefixedIPv4Address }
     * 
     */
    public PrefixedIPv4Address createPrefixedIPv4Address() {
        return new PrefixedIPv4Address();
    }

    /**
     * Create an instance of {@link PrefixedIPv6Address }
     * 
     */
    public PrefixedIPv6Address createPrefixedIPv6Address() {
        return new PrefixedIPv6Address();
    }

    /**
     * Create an instance of {@link HostnameInformation }
     * 
     */
    public HostnameInformation createHostnameInformation() {
        return new HostnameInformation();
    }

    /**
     * Create an instance of {@link HostnameInformationExtension }
     * 
     */
    public HostnameInformationExtension createHostnameInformationExtension() {
        return new HostnameInformationExtension();
    }

    /**
     * Create an instance of {@link DNSInformation }
     * 
     */
    public DNSInformation createDNSInformation() {
        return new DNSInformation();
    }

    /**
     * Create an instance of {@link DNSInformationExtension }
     * 
     */
    public DNSInformationExtension createDNSInformationExtension() {
        return new DNSInformationExtension();
    }

    /**
     * Create an instance of {@link NTPInformation }
     * 
     */
    public NTPInformation createNTPInformation() {
        return new NTPInformation();
    }

    /**
     * Create an instance of {@link NTPInformationExtension }
     * 
     */
    public NTPInformationExtension createNTPInformationExtension() {
        return new NTPInformationExtension();
    }

    /**
     * Create an instance of {@link DynamicDNSInformation }
     * 
     */
    public DynamicDNSInformation createDynamicDNSInformation() {
        return new DynamicDNSInformation();
    }

    /**
     * Create an instance of {@link DynamicDNSInformationExtension }
     * 
     */
    public DynamicDNSInformationExtension createDynamicDNSInformationExtension() {
        return new DynamicDNSInformationExtension();
    }

    /**
     * Create an instance of {@link NetworkInterfaceSetConfiguration }
     * 
     */
    public NetworkInterfaceSetConfiguration createNetworkInterfaceSetConfiguration() {
        return new NetworkInterfaceSetConfiguration();
    }

    /**
     * Create an instance of {@link NetworkInterfaceSetConfigurationExtension }
     * 
     */
    public NetworkInterfaceSetConfigurationExtension createNetworkInterfaceSetConfigurationExtension() {
        return new NetworkInterfaceSetConfigurationExtension();
    }

    /**
     * Create an instance of {@link IPv6NetworkInterfaceSetConfiguration }
     * 
     */
    public IPv6NetworkInterfaceSetConfiguration createIPv6NetworkInterfaceSetConfiguration() {
        return new IPv6NetworkInterfaceSetConfiguration();
    }

    /**
     * Create an instance of {@link IPv4NetworkInterfaceSetConfiguration }
     * 
     */
    public IPv4NetworkInterfaceSetConfiguration createIPv4NetworkInterfaceSetConfiguration() {
        return new IPv4NetworkInterfaceSetConfiguration();
    }

    /**
     * Create an instance of {@link NetworkGateway }
     * 
     */
    public NetworkGateway createNetworkGateway() {
        return new NetworkGateway();
    }

    /**
     * Create an instance of {@link NetworkZeroConfiguration }
     * 
     */
    public NetworkZeroConfiguration createNetworkZeroConfiguration() {
        return new NetworkZeroConfiguration();
    }

    /**
     * Create an instance of {@link NetworkZeroConfigurationExtension }
     * 
     */
    public NetworkZeroConfigurationExtension createNetworkZeroConfigurationExtension() {
        return new NetworkZeroConfigurationExtension();
    }

    /**
     * Create an instance of {@link NetworkZeroConfigurationExtension2 }
     * 
     */
    public NetworkZeroConfigurationExtension2 createNetworkZeroConfigurationExtension2() {
        return new NetworkZeroConfigurationExtension2();
    }

    /**
     * Create an instance of {@link IPAddressFilter }
     * 
     */
    public IPAddressFilter createIPAddressFilter() {
        return new IPAddressFilter();
    }

    /**
     * Create an instance of {@link IPAddressFilterExtension }
     * 
     */
    public IPAddressFilterExtension createIPAddressFilterExtension() {
        return new IPAddressFilterExtension();
    }

    /**
     * Create an instance of {@link Dot11Configuration }
     * 
     */
    public Dot11Configuration createDot11Configuration() {
        return new Dot11Configuration();
    }

    /**
     * Create an instance of {@link Dot11SecurityConfiguration }
     * 
     */
    public Dot11SecurityConfiguration createDot11SecurityConfiguration() {
        return new Dot11SecurityConfiguration();
    }

    /**
     * Create an instance of {@link Dot11SecurityConfigurationExtension }
     * 
     */
    public Dot11SecurityConfigurationExtension createDot11SecurityConfigurationExtension() {
        return new Dot11SecurityConfigurationExtension();
    }

    /**
     * Create an instance of {@link Dot11PSKSet }
     * 
     */
    public Dot11PSKSet createDot11PSKSet() {
        return new Dot11PSKSet();
    }

    /**
     * Create an instance of {@link Dot11PSKSetExtension }
     * 
     */
    public Dot11PSKSetExtension createDot11PSKSetExtension() {
        return new Dot11PSKSetExtension();
    }

    /**
     * Create an instance of {@link NetworkInterfaceSetConfigurationExtension2 }
     * 
     */
    public NetworkInterfaceSetConfigurationExtension2 createNetworkInterfaceSetConfigurationExtension2() {
        return new NetworkInterfaceSetConfigurationExtension2();
    }

    /**
     * Create an instance of {@link Dot11Capabilities }
     * 
     */
    public Dot11Capabilities createDot11Capabilities() {
        return new Dot11Capabilities();
    }

    /**
     * Create an instance of {@link Dot11Status }
     * 
     */
    public Dot11Status createDot11Status() {
        return new Dot11Status();
    }

    /**
     * Create an instance of {@link Dot11AvailableNetworks }
     * 
     */
    public Dot11AvailableNetworks createDot11AvailableNetworks() {
        return new Dot11AvailableNetworks();
    }

    /**
     * Create an instance of {@link Dot11AvailableNetworksExtension }
     * 
     */
    public Dot11AvailableNetworksExtension createDot11AvailableNetworksExtension() {
        return new Dot11AvailableNetworksExtension();
    }

    /**
     * Create an instance of {@link Capabilities }
     * 
     */
    public Capabilities createCapabilities() {
        return new Capabilities();
    }

    /**
     * Create an instance of {@link CapabilitiesExtension }
     * 
     */
    public CapabilitiesExtension createCapabilitiesExtension() {
        return new CapabilitiesExtension();
    }

    /**
     * Create an instance of {@link CapabilitiesExtension2 }
     * 
     */
    public CapabilitiesExtension2 createCapabilitiesExtension2() {
        return new CapabilitiesExtension2();
    }

    /**
     * Create an instance of {@link AnalyticsCapabilities }
     * 
     */
    public AnalyticsCapabilities createAnalyticsCapabilities() {
        return new AnalyticsCapabilities();
    }

    /**
     * Create an instance of {@link DeviceCapabilities }
     * 
     */
    public DeviceCapabilities createDeviceCapabilities() {
        return new DeviceCapabilities();
    }

    /**
     * Create an instance of {@link DeviceCapabilitiesExtension }
     * 
     */
    public DeviceCapabilitiesExtension createDeviceCapabilitiesExtension() {
        return new DeviceCapabilitiesExtension();
    }

    /**
     * Create an instance of {@link EventCapabilities }
     * 
     */
    public EventCapabilities createEventCapabilities() {
        return new EventCapabilities();
    }

    /**
     * Create an instance of {@link IOCapabilities }
     * 
     */
    public IOCapabilities createIOCapabilities() {
        return new IOCapabilities();
    }

    /**
     * Create an instance of {@link IOCapabilitiesExtension }
     * 
     */
    public IOCapabilitiesExtension createIOCapabilitiesExtension() {
        return new IOCapabilitiesExtension();
    }

    /**
     * Create an instance of {@link IOCapabilitiesExtension2 }
     * 
     */
    public IOCapabilitiesExtension2 createIOCapabilitiesExtension2() {
        return new IOCapabilitiesExtension2();
    }

    /**
     * Create an instance of {@link MediaCapabilities }
     * 
     */
    public MediaCapabilities createMediaCapabilities() {
        return new MediaCapabilities();
    }

    /**
     * Create an instance of {@link MediaCapabilitiesExtension }
     * 
     */
    public MediaCapabilitiesExtension createMediaCapabilitiesExtension() {
        return new MediaCapabilitiesExtension();
    }

    /**
     * Create an instance of {@link RealTimeStreamingCapabilities }
     * 
     */
    public RealTimeStreamingCapabilities createRealTimeStreamingCapabilities() {
        return new RealTimeStreamingCapabilities();
    }

    /**
     * Create an instance of {@link RealTimeStreamingCapabilitiesExtension }
     * 
     */
    public RealTimeStreamingCapabilitiesExtension createRealTimeStreamingCapabilitiesExtension() {
        return new RealTimeStreamingCapabilitiesExtension();
    }

    /**
     * Create an instance of {@link ProfileCapabilities }
     * 
     */
    public ProfileCapabilities createProfileCapabilities() {
        return new ProfileCapabilities();
    }

    /**
     * Create an instance of {@link NetworkCapabilities }
     * 
     */
    public NetworkCapabilities createNetworkCapabilities() {
        return new NetworkCapabilities();
    }

    /**
     * Create an instance of {@link NetworkCapabilitiesExtension }
     * 
     */
    public NetworkCapabilitiesExtension createNetworkCapabilitiesExtension() {
        return new NetworkCapabilitiesExtension();
    }

    /**
     * Create an instance of {@link NetworkCapabilitiesExtension2 }
     * 
     */
    public NetworkCapabilitiesExtension2 createNetworkCapabilitiesExtension2() {
        return new NetworkCapabilitiesExtension2();
    }

    /**
     * Create an instance of {@link SecurityCapabilities }
     * 
     */
    public SecurityCapabilities createSecurityCapabilities() {
        return new SecurityCapabilities();
    }

    /**
     * Create an instance of {@link SecurityCapabilitiesExtension }
     * 
     */
    public SecurityCapabilitiesExtension createSecurityCapabilitiesExtension() {
        return new SecurityCapabilitiesExtension();
    }

    /**
     * Create an instance of {@link SecurityCapabilitiesExtension2 }
     * 
     */
    public SecurityCapabilitiesExtension2 createSecurityCapabilitiesExtension2() {
        return new SecurityCapabilitiesExtension2();
    }

    /**
     * Create an instance of {@link SystemCapabilities }
     * 
     */
    public SystemCapabilities createSystemCapabilities() {
        return new SystemCapabilities();
    }

    /**
     * Create an instance of {@link SystemCapabilitiesExtension }
     * 
     */
    public SystemCapabilitiesExtension createSystemCapabilitiesExtension() {
        return new SystemCapabilitiesExtension();
    }

    /**
     * Create an instance of {@link SystemCapabilitiesExtension2 }
     * 
     */
    public SystemCapabilitiesExtension2 createSystemCapabilitiesExtension2() {
        return new SystemCapabilitiesExtension2();
    }

    /**
     * Create an instance of {@link OnvifVersion }
     * 
     */
    public OnvifVersion createOnvifVersion() {
        return new OnvifVersion();
    }

    /**
     * Create an instance of {@link ImagingCapabilities }
     * 
     */
    public ImagingCapabilities createImagingCapabilities() {
        return new ImagingCapabilities();
    }

    /**
     * Create an instance of {@link PTZCapabilities }
     * 
     */
    public PTZCapabilities createPTZCapabilities() {
        return new PTZCapabilities();
    }

    /**
     * Create an instance of {@link DeviceIOCapabilities }
     * 
     */
    public DeviceIOCapabilities createDeviceIOCapabilities() {
        return new DeviceIOCapabilities();
    }

    /**
     * Create an instance of {@link DisplayCapabilities }
     * 
     */
    public DisplayCapabilities createDisplayCapabilities() {
        return new DisplayCapabilities();
    }

    /**
     * Create an instance of {@link RecordingCapabilities }
     * 
     */
    public RecordingCapabilities createRecordingCapabilities() {
        return new RecordingCapabilities();
    }

    /**
     * Create an instance of {@link SearchCapabilities }
     * 
     */
    public SearchCapabilities createSearchCapabilities() {
        return new SearchCapabilities();
    }

    /**
     * Create an instance of {@link ReplayCapabilities }
     * 
     */
    public ReplayCapabilities createReplayCapabilities() {
        return new ReplayCapabilities();
    }

    /**
     * Create an instance of {@link ReceiverCapabilities }
     * 
     */
    public ReceiverCapabilities createReceiverCapabilities() {
        return new ReceiverCapabilities();
    }

    /**
     * Create an instance of {@link AnalyticsDeviceCapabilities }
     * 
     */
    public AnalyticsDeviceCapabilities createAnalyticsDeviceCapabilities() {
        return new AnalyticsDeviceCapabilities();
    }

    /**
     * Create an instance of {@link AnalyticsDeviceExtension }
     * 
     */
    public AnalyticsDeviceExtension createAnalyticsDeviceExtension() {
        return new AnalyticsDeviceExtension();
    }

    /**
     * Create an instance of {@link SystemLog }
     * 
     */
    public SystemLog createSystemLog() {
        return new SystemLog();
    }

    /**
     * Create an instance of {@link SupportInformation }
     * 
     */
    public SupportInformation createSupportInformation() {
        return new SupportInformation();
    }

    /**
     * Create an instance of {@link BinaryData }
     * 
     */
    public BinaryData createBinaryData() {
        return new BinaryData();
    }

    /**
     * Create an instance of {@link AttachmentData }
     * 
     */
    public AttachmentData createAttachmentData() {
        return new AttachmentData();
    }

    /**
     * Create an instance of {@link BackupFile }
     * 
     */
    public BackupFile createBackupFile() {
        return new BackupFile();
    }

    /**
     * Create an instance of {@link SystemLogUriList }
     * 
     */
    public SystemLogUriList createSystemLogUriList() {
        return new SystemLogUriList();
    }

    /**
     * Create an instance of {@link SystemLogUri }
     * 
     */
    public SystemLogUri createSystemLogUri() {
        return new SystemLogUri();
    }

    /**
     * Create an instance of {@link SystemDateTime }
     * 
     */
    public SystemDateTime createSystemDateTime() {
        return new SystemDateTime();
    }

    /**
     * Create an instance of {@link SystemDateTimeExtension }
     * 
     */
    public SystemDateTimeExtension createSystemDateTimeExtension() {
        return new SystemDateTimeExtension();
    }

    /**
     * Create an instance of {@link DateTime }
     * 
     */
    public DateTime createDateTime() {
        return new DateTime();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link Time }
     * 
     */
    public Time createTime() {
        return new Time();
    }

    /**
     * Create an instance of {@link TimeZone }
     * 
     */
    public TimeZone createTimeZone() {
        return new TimeZone();
    }

    /**
     * Create an instance of {@link RemoteUser }
     * 
     */
    public RemoteUser createRemoteUser() {
        return new RemoteUser();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link UserExtension }
     * 
     */
    public UserExtension createUserExtension() {
        return new UserExtension();
    }

    /**
     * Create an instance of {@link CertificateGenerationParameters }
     * 
     */
    public CertificateGenerationParameters createCertificateGenerationParameters() {
        return new CertificateGenerationParameters();
    }

    /**
     * Create an instance of {@link CertificateGenerationParametersExtension }
     * 
     */
    public CertificateGenerationParametersExtension createCertificateGenerationParametersExtension() {
        return new CertificateGenerationParametersExtension();
    }

    /**
     * Create an instance of {@link Certificate }
     * 
     */
    public Certificate createCertificate() {
        return new Certificate();
    }

    /**
     * Create an instance of {@link CertificateStatus }
     * 
     */
    public CertificateStatus createCertificateStatus() {
        return new CertificateStatus();
    }

    /**
     * Create an instance of {@link CertificateWithPrivateKey }
     * 
     */
    public CertificateWithPrivateKey createCertificateWithPrivateKey() {
        return new CertificateWithPrivateKey();
    }

    /**
     * Create an instance of {@link CertificateInformation }
     * 
     */
    public CertificateInformation createCertificateInformation() {
        return new CertificateInformation();
    }

    /**
     * Create an instance of {@link CertificateUsage }
     * 
     */
    public CertificateUsage createCertificateUsage() {
        return new CertificateUsage();
    }

    /**
     * Create an instance of {@link CertificateInformationExtension }
     * 
     */
    public CertificateInformationExtension createCertificateInformationExtension() {
        return new CertificateInformationExtension();
    }

    /**
     * Create an instance of {@link Dot1XConfiguration }
     * 
     */
    public Dot1XConfiguration createDot1XConfiguration() {
        return new Dot1XConfiguration();
    }

    /**
     * Create an instance of {@link Dot1XConfigurationExtension }
     * 
     */
    public Dot1XConfigurationExtension createDot1XConfigurationExtension() {
        return new Dot1XConfigurationExtension();
    }

    /**
     * Create an instance of {@link EAPMethodConfiguration }
     * 
     */
    public EAPMethodConfiguration createEAPMethodConfiguration() {
        return new EAPMethodConfiguration();
    }

    /**
     * Create an instance of {@link EapMethodExtension }
     * 
     */
    public EapMethodExtension createEapMethodExtension() {
        return new EapMethodExtension();
    }

    /**
     * Create an instance of {@link TLSConfiguration }
     * 
     */
    public TLSConfiguration createTLSConfiguration() {
        return new TLSConfiguration();
    }

    /**
     * Create an instance of {@link GenericEapPwdConfigurationExtension }
     * 
     */
    public GenericEapPwdConfigurationExtension createGenericEapPwdConfigurationExtension() {
        return new GenericEapPwdConfigurationExtension();
    }

    /**
     * Create an instance of {@link RelayOutputSettings }
     * 
     */
    public RelayOutputSettings createRelayOutputSettings() {
        return new RelayOutputSettings();
    }

    /**
     * Create an instance of {@link RelayOutput }
     * 
     */
    public RelayOutput createRelayOutput() {
        return new RelayOutput();
    }

    /**
     * Create an instance of {@link DigitalInput }
     * 
     */
    public DigitalInput createDigitalInput() {
        return new DigitalInput();
    }

    /**
     * Create an instance of {@link PTZNode }
     * 
     */
    public PTZNode createPTZNode() {
        return new PTZNode();
    }

    /**
     * Create an instance of {@link PTZNodeExtension }
     * 
     */
    public PTZNodeExtension createPTZNodeExtension() {
        return new PTZNodeExtension();
    }

    /**
     * Create an instance of {@link PTZNodeExtension2 }
     * 
     */
    public PTZNodeExtension2 createPTZNodeExtension2() {
        return new PTZNodeExtension2();
    }

    /**
     * Create an instance of {@link PTZPresetTourSupported }
     * 
     */
    public PTZPresetTourSupported createPTZPresetTourSupported() {
        return new PTZPresetTourSupported();
    }

    /**
     * Create an instance of {@link PTZPresetTourSupportedExtension }
     * 
     */
    public PTZPresetTourSupportedExtension createPTZPresetTourSupportedExtension() {
        return new PTZPresetTourSupportedExtension();
    }

    /**
     * Create an instance of {@link PTZConfigurationExtension }
     * 
     */
    public PTZConfigurationExtension createPTZConfigurationExtension() {
        return new PTZConfigurationExtension();
    }

    /**
     * Create an instance of {@link PTZConfigurationExtension2 }
     * 
     */
    public PTZConfigurationExtension2 createPTZConfigurationExtension2() {
        return new PTZConfigurationExtension2();
    }

    /**
     * Create an instance of {@link PTControlDirection }
     * 
     */
    public PTControlDirection createPTControlDirection() {
        return new PTControlDirection();
    }

    /**
     * Create an instance of {@link PTControlDirectionExtension }
     * 
     */
    public PTControlDirectionExtension createPTControlDirectionExtension() {
        return new PTControlDirectionExtension();
    }

    /**
     * Create an instance of {@link EFlip }
     * 
     */
    public EFlip createEFlip() {
        return new EFlip();
    }

    /**
     * Create an instance of {@link Reverse }
     * 
     */
    public Reverse createReverse() {
        return new Reverse();
    }

    /**
     * Create an instance of {@link PTZConfigurationOptions }
     * 
     */
    public PTZConfigurationOptions createPTZConfigurationOptions() {
        return new PTZConfigurationOptions();
    }

    /**
     * Create an instance of {@link PTZConfigurationOptions2 }
     * 
     */
    public PTZConfigurationOptions2 createPTZConfigurationOptions2() {
        return new PTZConfigurationOptions2();
    }

    /**
     * Create an instance of {@link PTControlDirectionOptions }
     * 
     */
    public PTControlDirectionOptions createPTControlDirectionOptions() {
        return new PTControlDirectionOptions();
    }

    /**
     * Create an instance of {@link PTControlDirectionOptionsExtension }
     * 
     */
    public PTControlDirectionOptionsExtension createPTControlDirectionOptionsExtension() {
        return new PTControlDirectionOptionsExtension();
    }

    /**
     * Create an instance of {@link EFlipOptions }
     * 
     */
    public EFlipOptions createEFlipOptions() {
        return new EFlipOptions();
    }

    /**
     * Create an instance of {@link EFlipOptionsExtension }
     * 
     */
    public EFlipOptionsExtension createEFlipOptionsExtension() {
        return new EFlipOptionsExtension();
    }

    /**
     * Create an instance of {@link ReverseOptions }
     * 
     */
    public ReverseOptions createReverseOptions() {
        return new ReverseOptions();
    }

    /**
     * Create an instance of {@link ReverseOptionsExtension }
     * 
     */
    public ReverseOptionsExtension createReverseOptionsExtension() {
        return new ReverseOptionsExtension();
    }

    /**
     * Create an instance of {@link PanTiltLimits }
     * 
     */
    public PanTiltLimits createPanTiltLimits() {
        return new PanTiltLimits();
    }

    /**
     * Create an instance of {@link ZoomLimits }
     * 
     */
    public ZoomLimits createZoomLimits() {
        return new ZoomLimits();
    }

    /**
     * Create an instance of {@link PTZSpaces }
     * 
     */
    public PTZSpaces createPTZSpaces() {
        return new PTZSpaces();
    }

    /**
     * Create an instance of {@link PTZSpacesExtension }
     * 
     */
    public PTZSpacesExtension createPTZSpacesExtension() {
        return new PTZSpacesExtension();
    }

    /**
     * Create an instance of {@link Space2DDescription }
     * 
     */
    public Space2DDescription createSpace2DDescription() {
        return new Space2DDescription();
    }

    /**
     * Create an instance of {@link Space1DDescription }
     * 
     */
    public Space1DDescription createSpace1DDescription() {
        return new Space1DDescription();
    }

    /**
     * Create an instance of {@link Vector2D }
     * 
     */
    public Vector2D createVector2D() {
        return new Vector2D();
    }

    /**
     * Create an instance of {@link Vector1D }
     * 
     */
    public Vector1D createVector1D() {
        return new Vector1D();
    }

    /**
     * Create an instance of {@link PTZVector }
     * 
     */
    public PTZVector createPTZVector() {
        return new PTZVector();
    }

    /**
     * Create an instance of {@link PTZSpeed }
     * 
     */
    public PTZSpeed createPTZSpeed() {
        return new PTZSpeed();
    }

    /**
     * Create an instance of {@link PTZStatus }
     * 
     */
    public PTZStatus createPTZStatus() {
        return new PTZStatus();
    }

    /**
     * Create an instance of {@link PTZPreset }
     * 
     */
    public PTZPreset createPTZPreset() {
        return new PTZPreset();
    }

    /**
     * Create an instance of {@link PTZMoveStatus }
     * 
     */
    public PTZMoveStatus createPTZMoveStatus() {
        return new PTZMoveStatus();
    }

    /**
     * Create an instance of {@link PresetTour }
     * 
     */
    public PresetTour createPresetTour() {
        return new PresetTour();
    }

    /**
     * Create an instance of {@link PTZPresetTourExtension }
     * 
     */
    public PTZPresetTourExtension createPTZPresetTourExtension() {
        return new PTZPresetTourExtension();
    }

    /**
     * Create an instance of {@link PTZPresetTourSpot }
     * 
     */
    public PTZPresetTourSpot createPTZPresetTourSpot() {
        return new PTZPresetTourSpot();
    }

    /**
     * Create an instance of {@link PTZPresetTourSpotExtension }
     * 
     */
    public PTZPresetTourSpotExtension createPTZPresetTourSpotExtension() {
        return new PTZPresetTourSpotExtension();
    }

    /**
     * Create an instance of {@link PTZPresetTourPresetDetail }
     * 
     */
    public PTZPresetTourPresetDetail createPTZPresetTourPresetDetail() {
        return new PTZPresetTourPresetDetail();
    }

    /**
     * Create an instance of {@link PTZPresetTourTypeExtension }
     * 
     */
    public PTZPresetTourTypeExtension createPTZPresetTourTypeExtension() {
        return new PTZPresetTourTypeExtension();
    }

    /**
     * Create an instance of {@link PTZPresetTourStatus }
     * 
     */
    public PTZPresetTourStatus createPTZPresetTourStatus() {
        return new PTZPresetTourStatus();
    }

    /**
     * Create an instance of {@link PTZPresetTourStatusExtension }
     * 
     */
    public PTZPresetTourStatusExtension createPTZPresetTourStatusExtension() {
        return new PTZPresetTourStatusExtension();
    }

    /**
     * Create an instance of {@link PTZPresetTourStartingCondition }
     * 
     */
    public PTZPresetTourStartingCondition createPTZPresetTourStartingCondition() {
        return new PTZPresetTourStartingCondition();
    }

    /**
     * Create an instance of {@link PTZPresetTourStartingConditionExtension }
     * 
     */
    public PTZPresetTourStartingConditionExtension createPTZPresetTourStartingConditionExtension() {
        return new PTZPresetTourStartingConditionExtension();
    }

    /**
     * Create an instance of {@link PTZPresetTourOptions }
     * 
     */
    public PTZPresetTourOptions createPTZPresetTourOptions() {
        return new PTZPresetTourOptions();
    }

    /**
     * Create an instance of {@link PTZPresetTourSpotOptions }
     * 
     */
    public PTZPresetTourSpotOptions createPTZPresetTourSpotOptions() {
        return new PTZPresetTourSpotOptions();
    }

    /**
     * Create an instance of {@link PTZPresetTourPresetDetailOptions }
     * 
     */
    public PTZPresetTourPresetDetailOptions createPTZPresetTourPresetDetailOptions() {
        return new PTZPresetTourPresetDetailOptions();
    }

    /**
     * Create an instance of {@link PTZPresetTourPresetDetailOptionsExtension }
     * 
     */
    public PTZPresetTourPresetDetailOptionsExtension createPTZPresetTourPresetDetailOptionsExtension() {
        return new PTZPresetTourPresetDetailOptionsExtension();
    }

    /**
     * Create an instance of {@link PTZPresetTourStartingConditionOptions }
     * 
     */
    public PTZPresetTourStartingConditionOptions createPTZPresetTourStartingConditionOptions() {
        return new PTZPresetTourStartingConditionOptions();
    }

    /**
     * Create an instance of {@link PTZPresetTourStartingConditionOptionsExtension }
     * 
     */
    public PTZPresetTourStartingConditionOptionsExtension createPTZPresetTourStartingConditionOptionsExtension() {
        return new PTZPresetTourStartingConditionOptionsExtension();
    }

    /**
     * Create an instance of {@link ImagingStatus }
     * 
     */
    public ImagingStatus createImagingStatus() {
        return new ImagingStatus();
    }

    /**
     * Create an instance of {@link FocusStatus }
     * 
     */
    public FocusStatus createFocusStatus() {
        return new FocusStatus();
    }

    /**
     * Create an instance of {@link FocusConfiguration }
     * 
     */
    public FocusConfiguration createFocusConfiguration() {
        return new FocusConfiguration();
    }

    /**
     * Create an instance of {@link ImagingSettings }
     * 
     */
    public ImagingSettings createImagingSettings() {
        return new ImagingSettings();
    }

    /**
     * Create an instance of {@link ImagingSettingsExtension }
     * 
     */
    public ImagingSettingsExtension createImagingSettingsExtension() {
        return new ImagingSettingsExtension();
    }

    /**
     * Create an instance of {@link Exposure }
     * 
     */
    public Exposure createExposure() {
        return new Exposure();
    }

    /**
     * Create an instance of {@link WideDynamicRange }
     * 
     */
    public WideDynamicRange createWideDynamicRange() {
        return new WideDynamicRange();
    }

    /**
     * Create an instance of {@link BacklightCompensation }
     * 
     */
    public BacklightCompensation createBacklightCompensation() {
        return new BacklightCompensation();
    }

    /**
     * Create an instance of {@link ImagingOptions }
     * 
     */
    public ImagingOptions createImagingOptions() {
        return new ImagingOptions();
    }

    /**
     * Create an instance of {@link WideDynamicRangeOptions }
     * 
     */
    public WideDynamicRangeOptions createWideDynamicRangeOptions() {
        return new WideDynamicRangeOptions();
    }

    /**
     * Create an instance of {@link BacklightCompensationOptions }
     * 
     */
    public BacklightCompensationOptions createBacklightCompensationOptions() {
        return new BacklightCompensationOptions();
    }

    /**
     * Create an instance of {@link FocusOptions }
     * 
     */
    public FocusOptions createFocusOptions() {
        return new FocusOptions();
    }

    /**
     * Create an instance of {@link ExposureOptions }
     * 
     */
    public ExposureOptions createExposureOptions() {
        return new ExposureOptions();
    }

    /**
     * Create an instance of {@link WhiteBalanceOptions }
     * 
     */
    public WhiteBalanceOptions createWhiteBalanceOptions() {
        return new WhiteBalanceOptions();
    }

    /**
     * Create an instance of {@link FocusMove }
     * 
     */
    public FocusMove createFocusMove() {
        return new FocusMove();
    }

    /**
     * Create an instance of {@link AbsoluteFocus }
     * 
     */
    public AbsoluteFocus createAbsoluteFocus() {
        return new AbsoluteFocus();
    }

    /**
     * Create an instance of {@link RelativeFocus }
     * 
     */
    public RelativeFocus createRelativeFocus() {
        return new RelativeFocus();
    }

    /**
     * Create an instance of {@link ContinuousFocus }
     * 
     */
    public ContinuousFocus createContinuousFocus() {
        return new ContinuousFocus();
    }

    /**
     * Create an instance of {@link MoveOptions }
     * 
     */
    public MoveOptions createMoveOptions() {
        return new MoveOptions();
    }

    /**
     * Create an instance of {@link AbsoluteFocusOptions }
     * 
     */
    public AbsoluteFocusOptions createAbsoluteFocusOptions() {
        return new AbsoluteFocusOptions();
    }

    /**
     * Create an instance of {@link RelativeFocusOptions }
     * 
     */
    public RelativeFocusOptions createRelativeFocusOptions() {
        return new RelativeFocusOptions();
    }

    /**
     * Create an instance of {@link ContinuousFocusOptions }
     * 
     */
    public ContinuousFocusOptions createContinuousFocusOptions() {
        return new ContinuousFocusOptions();
    }

    /**
     * Create an instance of {@link WhiteBalance }
     * 
     */
    public WhiteBalance createWhiteBalance() {
        return new WhiteBalance();
    }

    /**
     * Create an instance of {@link ImagingStatus20 }
     * 
     */
    public ImagingStatus20 createImagingStatus20() {
        return new ImagingStatus20();
    }

    /**
     * Create an instance of {@link ImagingStatus20Extension }
     * 
     */
    public ImagingStatus20Extension createImagingStatus20Extension() {
        return new ImagingStatus20Extension();
    }

    /**
     * Create an instance of {@link FocusStatus20 }
     * 
     */
    public FocusStatus20 createFocusStatus20() {
        return new FocusStatus20();
    }

    /**
     * Create an instance of {@link FocusStatus20Extension }
     * 
     */
    public FocusStatus20Extension createFocusStatus20Extension() {
        return new FocusStatus20Extension();
    }

    /**
     * Create an instance of {@link ImagingSettings20 }
     * 
     */
    public ImagingSettings20 createImagingSettings20() {
        return new ImagingSettings20();
    }

    /**
     * Create an instance of {@link ImagingSettingsExtension20 }
     * 
     */
    public ImagingSettingsExtension20 createImagingSettingsExtension20() {
        return new ImagingSettingsExtension20();
    }

    /**
     * Create an instance of {@link ImagingSettingsExtension202 }
     * 
     */
    public ImagingSettingsExtension202 createImagingSettingsExtension202() {
        return new ImagingSettingsExtension202();
    }

    /**
     * Create an instance of {@link ImagingSettingsExtension203 }
     * 
     */
    public ImagingSettingsExtension203 createImagingSettingsExtension203() {
        return new ImagingSettingsExtension203();
    }

    /**
     * Create an instance of {@link ImagingSettingsExtension204 }
     * 
     */
    public ImagingSettingsExtension204 createImagingSettingsExtension204() {
        return new ImagingSettingsExtension204();
    }

    /**
     * Create an instance of {@link ImageStabilization }
     * 
     */
    public ImageStabilization createImageStabilization() {
        return new ImageStabilization();
    }

    /**
     * Create an instance of {@link ImageStabilizationExtension }
     * 
     */
    public ImageStabilizationExtension createImageStabilizationExtension() {
        return new ImageStabilizationExtension();
    }

    /**
     * Create an instance of {@link IrCutFilterAutoAdjustment }
     * 
     */
    public IrCutFilterAutoAdjustment createIrCutFilterAutoAdjustment() {
        return new IrCutFilterAutoAdjustment();
    }

    /**
     * Create an instance of {@link IrCutFilterAutoAdjustmentExtension }
     * 
     */
    public IrCutFilterAutoAdjustmentExtension createIrCutFilterAutoAdjustmentExtension() {
        return new IrCutFilterAutoAdjustmentExtension();
    }

    /**
     * Create an instance of {@link WideDynamicRange20 }
     * 
     */
    public WideDynamicRange20 createWideDynamicRange20() {
        return new WideDynamicRange20();
    }

    /**
     * Create an instance of {@link BacklightCompensation20 }
     * 
     */
    public BacklightCompensation20 createBacklightCompensation20() {
        return new BacklightCompensation20();
    }

    /**
     * Create an instance of {@link Exposure20 }
     * 
     */
    public Exposure20 createExposure20() {
        return new Exposure20();
    }

    /**
     * Create an instance of {@link ToneCompensation }
     * 
     */
    public ToneCompensation createToneCompensation() {
        return new ToneCompensation();
    }

    /**
     * Create an instance of {@link ToneCompensationExtension }
     * 
     */
    public ToneCompensationExtension createToneCompensationExtension() {
        return new ToneCompensationExtension();
    }

    /**
     * Create an instance of {@link Defogging }
     * 
     */
    public Defogging createDefogging() {
        return new Defogging();
    }

    /**
     * Create an instance of {@link DefoggingExtension }
     * 
     */
    public DefoggingExtension createDefoggingExtension() {
        return new DefoggingExtension();
    }

    /**
     * Create an instance of {@link NoiseReduction }
     * 
     */
    public NoiseReduction createNoiseReduction() {
        return new NoiseReduction();
    }

    /**
     * Create an instance of {@link ImagingOptions20 }
     * 
     */
    public ImagingOptions20 createImagingOptions20() {
        return new ImagingOptions20();
    }

    /**
     * Create an instance of {@link ImagingOptions20Extension }
     * 
     */
    public ImagingOptions20Extension createImagingOptions20Extension() {
        return new ImagingOptions20Extension();
    }

    /**
     * Create an instance of {@link ImagingOptions20Extension2 }
     * 
     */
    public ImagingOptions20Extension2 createImagingOptions20Extension2() {
        return new ImagingOptions20Extension2();
    }

    /**
     * Create an instance of {@link ImagingOptions20Extension3 }
     * 
     */
    public ImagingOptions20Extension3 createImagingOptions20Extension3() {
        return new ImagingOptions20Extension3();
    }

    /**
     * Create an instance of {@link ImagingOptions20Extension4 }
     * 
     */
    public ImagingOptions20Extension4 createImagingOptions20Extension4() {
        return new ImagingOptions20Extension4();
    }

    /**
     * Create an instance of {@link ImageStabilizationOptions }
     * 
     */
    public ImageStabilizationOptions createImageStabilizationOptions() {
        return new ImageStabilizationOptions();
    }

    /**
     * Create an instance of {@link ImageStabilizationOptionsExtension }
     * 
     */
    public ImageStabilizationOptionsExtension createImageStabilizationOptionsExtension() {
        return new ImageStabilizationOptionsExtension();
    }

    /**
     * Create an instance of {@link IrCutFilterAutoAdjustmentOptions }
     * 
     */
    public IrCutFilterAutoAdjustmentOptions createIrCutFilterAutoAdjustmentOptions() {
        return new IrCutFilterAutoAdjustmentOptions();
    }

    /**
     * Create an instance of {@link IrCutFilterAutoAdjustmentOptionsExtension }
     * 
     */
    public IrCutFilterAutoAdjustmentOptionsExtension createIrCutFilterAutoAdjustmentOptionsExtension() {
        return new IrCutFilterAutoAdjustmentOptionsExtension();
    }

    /**
     * Create an instance of {@link WideDynamicRangeOptions20 }
     * 
     */
    public WideDynamicRangeOptions20 createWideDynamicRangeOptions20() {
        return new WideDynamicRangeOptions20();
    }

    /**
     * Create an instance of {@link BacklightCompensationOptions20 }
     * 
     */
    public BacklightCompensationOptions20 createBacklightCompensationOptions20() {
        return new BacklightCompensationOptions20();
    }

    /**
     * Create an instance of {@link ExposureOptions20 }
     * 
     */
    public ExposureOptions20 createExposureOptions20() {
        return new ExposureOptions20();
    }

    /**
     * Create an instance of {@link MoveOptions20 }
     * 
     */
    public MoveOptions20 createMoveOptions20() {
        return new MoveOptions20();
    }

    /**
     * Create an instance of {@link RelativeFocusOptions20 }
     * 
     */
    public RelativeFocusOptions20 createRelativeFocusOptions20() {
        return new RelativeFocusOptions20();
    }

    /**
     * Create an instance of {@link WhiteBalance20 }
     * 
     */
    public WhiteBalance20 createWhiteBalance20() {
        return new WhiteBalance20();
    }

    /**
     * Create an instance of {@link WhiteBalance20Extension }
     * 
     */
    public WhiteBalance20Extension createWhiteBalance20Extension() {
        return new WhiteBalance20Extension();
    }

    /**
     * Create an instance of {@link FocusConfiguration20 }
     * 
     */
    public FocusConfiguration20 createFocusConfiguration20() {
        return new FocusConfiguration20();
    }

    /**
     * Create an instance of {@link FocusConfiguration20Extension }
     * 
     */
    public FocusConfiguration20Extension createFocusConfiguration20Extension() {
        return new FocusConfiguration20Extension();
    }

    /**
     * Create an instance of {@link WhiteBalanceOptions20 }
     * 
     */
    public WhiteBalanceOptions20 createWhiteBalanceOptions20() {
        return new WhiteBalanceOptions20();
    }

    /**
     * Create an instance of {@link WhiteBalanceOptions20Extension }
     * 
     */
    public WhiteBalanceOptions20Extension createWhiteBalanceOptions20Extension() {
        return new WhiteBalanceOptions20Extension();
    }

    /**
     * Create an instance of {@link FocusOptions20 }
     * 
     */
    public FocusOptions20 createFocusOptions20() {
        return new FocusOptions20();
    }

    /**
     * Create an instance of {@link FocusOptions20Extension }
     * 
     */
    public FocusOptions20Extension createFocusOptions20Extension() {
        return new FocusOptions20Extension();
    }

    /**
     * Create an instance of {@link ToneCompensationOptions }
     * 
     */
    public ToneCompensationOptions createToneCompensationOptions() {
        return new ToneCompensationOptions();
    }

    /**
     * Create an instance of {@link DefoggingOptions }
     * 
     */
    public DefoggingOptions createDefoggingOptions() {
        return new DefoggingOptions();
    }

    /**
     * Create an instance of {@link NoiseReductionOptions }
     * 
     */
    public NoiseReductionOptions createNoiseReductionOptions() {
        return new NoiseReductionOptions();
    }

    /**
     * Create an instance of {@link ItemListExtension }
     * 
     */
    public ItemListExtension createItemListExtension() {
        return new ItemListExtension();
    }

    /**
     * Create an instance of {@link MessageDescription }
     * 
     */
    public MessageDescription createMessageDescription() {
        return new MessageDescription();
    }

    /**
     * Create an instance of {@link MessageDescriptionExtension }
     * 
     */
    public MessageDescriptionExtension createMessageDescriptionExtension() {
        return new MessageDescriptionExtension();
    }

    /**
     * Create an instance of {@link ItemListDescriptionExtension }
     * 
     */
    public ItemListDescriptionExtension createItemListDescriptionExtension() {
        return new ItemListDescriptionExtension();
    }

    /**
     * Create an instance of {@link Vector }
     * 
     */
    public Vector createVector() {
        return new Vector();
    }

    /**
     * Create an instance of {@link Rectangle }
     * 
     */
    public Rectangle createRectangle() {
        return new Rectangle();
    }

    /**
     * Create an instance of {@link Color }
     * 
     */
    public Color createColor() {
        return new Color();
    }

    /**
     * Create an instance of {@link ColorCovariance }
     * 
     */
    public ColorCovariance createColorCovariance() {
        return new ColorCovariance();
    }

    /**
     * Create an instance of {@link Appearance }
     * 
     */
    public Appearance createAppearance() {
        return new Appearance();
    }

    /**
     * Create an instance of {@link AppearanceExtension }
     * 
     */
    public AppearanceExtension createAppearanceExtension() {
        return new AppearanceExtension();
    }

    /**
     * Create an instance of {@link ShapeDescriptor }
     * 
     */
    public ShapeDescriptor createShapeDescriptor() {
        return new ShapeDescriptor();
    }

    /**
     * Create an instance of {@link ShapeDescriptorExtension }
     * 
     */
    public ShapeDescriptorExtension createShapeDescriptorExtension() {
        return new ShapeDescriptorExtension();
    }

    /**
     * Create an instance of {@link ColorDescriptorExtension }
     * 
     */
    public ColorDescriptorExtension createColorDescriptorExtension() {
        return new ColorDescriptorExtension();
    }

    /**
     * Create an instance of {@link ClassDescriptorExtension }
     * 
     */
    public ClassDescriptorExtension createClassDescriptorExtension() {
        return new ClassDescriptorExtension();
    }

    /**
     * Create an instance of {@link ClassDescriptorExtension2 }
     * 
     */
    public ClassDescriptorExtension2 createClassDescriptorExtension2() {
        return new ClassDescriptorExtension2();
    }

    /**
     * Create an instance of {@link OtherType }
     * 
     */
    public OtherType createOtherType() {
        return new OtherType();
    }

    /**
     * Create an instance of {@link Object }
     * 
     */
    public Object createObject() {
        return new Object();
    }

    /**
     * Create an instance of {@link ObjectExtension }
     * 
     */
    public ObjectExtension createObjectExtension() {
        return new ObjectExtension();
    }

    /**
     * Create an instance of {@link Transformation }
     * 
     */
    public Transformation createTransformation() {
        return new Transformation();
    }

    /**
     * Create an instance of {@link TransformationExtension }
     * 
     */
    public TransformationExtension createTransformationExtension() {
        return new TransformationExtension();
    }

    /**
     * Create an instance of {@link Frame }
     * 
     */
    public Frame createFrame() {
        return new Frame();
    }

    /**
     * Create an instance of {@link FrameExtension }
     * 
     */
    public FrameExtension createFrameExtension() {
        return new FrameExtension();
    }

    /**
     * Create an instance of {@link FrameExtension2 }
     * 
     */
    public FrameExtension2 createFrameExtension2() {
        return new FrameExtension2();
    }

    /**
     * Create an instance of {@link Merge }
     * 
     */
    public Merge createMerge() {
        return new Merge();
    }

    /**
     * Create an instance of {@link Split }
     * 
     */
    public Split createSplit() {
        return new Split();
    }

    /**
     * Create an instance of {@link Rename }
     * 
     */
    public Rename createRename() {
        return new Rename();
    }

    /**
     * Create an instance of {@link ObjectId }
     * 
     */
    public ObjectId createObjectId() {
        return new ObjectId();
    }

    /**
     * Create an instance of {@link BehaviourExtension }
     * 
     */
    public BehaviourExtension createBehaviourExtension() {
        return new BehaviourExtension();
    }

    /**
     * Create an instance of {@link ObjectTree }
     * 
     */
    public ObjectTree createObjectTree() {
        return new ObjectTree();
    }

    /**
     * Create an instance of {@link ObjectTreeExtension }
     * 
     */
    public ObjectTreeExtension createObjectTreeExtension() {
        return new ObjectTreeExtension();
    }

    /**
     * Create an instance of {@link MotionInCells }
     * 
     */
    public MotionInCells createMotionInCells() {
        return new MotionInCells();
    }

    /**
     * Create an instance of {@link AnalyticsEngineConfiguration }
     * 
     */
    public AnalyticsEngineConfiguration createAnalyticsEngineConfiguration() {
        return new AnalyticsEngineConfiguration();
    }

    /**
     * Create an instance of {@link AnalyticsEngineConfigurationExtension }
     * 
     */
    public AnalyticsEngineConfigurationExtension createAnalyticsEngineConfigurationExtension() {
        return new AnalyticsEngineConfigurationExtension();
    }

    /**
     * Create an instance of {@link RuleEngineConfiguration }
     * 
     */
    public RuleEngineConfiguration createRuleEngineConfiguration() {
        return new RuleEngineConfiguration();
    }

    /**
     * Create an instance of {@link RuleEngineConfigurationExtension }
     * 
     */
    public RuleEngineConfigurationExtension createRuleEngineConfigurationExtension() {
        return new RuleEngineConfigurationExtension();
    }

    /**
     * Create an instance of {@link Config }
     * 
     */
    public Config createConfig() {
        return new Config();
    }

    /**
     * Create an instance of {@link ConfigDescriptionExtension }
     * 
     */
    public ConfigDescriptionExtension createConfigDescriptionExtension() {
        return new ConfigDescriptionExtension();
    }

    /**
     * Create an instance of {@link SupportedRules }
     * 
     */
    public SupportedRules createSupportedRules() {
        return new SupportedRules();
    }

    /**
     * Create an instance of {@link SupportedRulesExtension }
     * 
     */
    public SupportedRulesExtension createSupportedRulesExtension() {
        return new SupportedRulesExtension();
    }

    /**
     * Create an instance of {@link SupportedAnalyticsModules }
     * 
     */
    public SupportedAnalyticsModules createSupportedAnalyticsModules() {
        return new SupportedAnalyticsModules();
    }

    /**
     * Create an instance of {@link SupportedAnalyticsModulesExtension }
     * 
     */
    public SupportedAnalyticsModulesExtension createSupportedAnalyticsModulesExtension() {
        return new SupportedAnalyticsModulesExtension();
    }

    /**
     * Create an instance of {@link PolygonConfiguration }
     * 
     */
    public PolygonConfiguration createPolygonConfiguration() {
        return new PolygonConfiguration();
    }

    /**
     * Create an instance of {@link PolylineArray }
     * 
     */
    public PolylineArray createPolylineArray() {
        return new PolylineArray();
    }

    /**
     * Create an instance of {@link PolylineArrayExtension }
     * 
     */
    public PolylineArrayExtension createPolylineArrayExtension() {
        return new PolylineArrayExtension();
    }

    /**
     * Create an instance of {@link PolylineArrayConfiguration }
     * 
     */
    public PolylineArrayConfiguration createPolylineArrayConfiguration() {
        return new PolylineArrayConfiguration();
    }

    /**
     * Create an instance of {@link MotionExpression }
     * 
     */
    public MotionExpression createMotionExpression() {
        return new MotionExpression();
    }

    /**
     * Create an instance of {@link MotionExpressionConfiguration }
     * 
     */
    public MotionExpressionConfiguration createMotionExpressionConfiguration() {
        return new MotionExpressionConfiguration();
    }

    /**
     * Create an instance of {@link CellLayout }
     * 
     */
    public CellLayout createCellLayout() {
        return new CellLayout();
    }

    /**
     * Create an instance of {@link MetadataStreamExtension }
     * 
     */
    public MetadataStreamExtension createMetadataStreamExtension() {
        return new MetadataStreamExtension();
    }

    /**
     * Create an instance of {@link MetadataStreamExtension2 }
     * 
     */
    public MetadataStreamExtension2 createMetadataStreamExtension2() {
        return new MetadataStreamExtension2();
    }

    /**
     * Create an instance of {@link AudioAnalyticsStream }
     * 
     */
    public AudioAnalyticsStream createAudioAnalyticsStream() {
        return new AudioAnalyticsStream();
    }

    /**
     * Create an instance of {@link AudioDescriptor }
     * 
     */
    public AudioDescriptor createAudioDescriptor() {
        return new AudioDescriptor();
    }

    /**
     * Create an instance of {@link AudioAnalyticsStreamExtension }
     * 
     */
    public AudioAnalyticsStreamExtension createAudioAnalyticsStreamExtension() {
        return new AudioAnalyticsStreamExtension();
    }

    /**
     * Create an instance of {@link VideoAnalyticsStream }
     * 
     */
    public VideoAnalyticsStream createVideoAnalyticsStream() {
        return new VideoAnalyticsStream();
    }

    /**
     * Create an instance of {@link VideoAnalyticsStreamExtension }
     * 
     */
    public VideoAnalyticsStreamExtension createVideoAnalyticsStreamExtension() {
        return new VideoAnalyticsStreamExtension();
    }

    /**
     * Create an instance of {@link PTZStream }
     * 
     */
    public PTZStream createPTZStream() {
        return new PTZStream();
    }

    /**
     * Create an instance of {@link PTZStreamExtension }
     * 
     */
    public PTZStreamExtension createPTZStreamExtension() {
        return new PTZStreamExtension();
    }

    /**
     * Create an instance of {@link EventStream }
     * 
     */
    public EventStream createEventStream() {
        return new EventStream();
    }

    /**
     * Create an instance of {@link EventStreamExtension }
     * 
     */
    public EventStreamExtension createEventStreamExtension() {
        return new EventStreamExtension();
    }

    /**
     * Create an instance of {@link PaneConfiguration }
     * 
     */
    public PaneConfiguration createPaneConfiguration() {
        return new PaneConfiguration();
    }

    /**
     * Create an instance of {@link PaneLayout }
     * 
     */
    public PaneLayout createPaneLayout() {
        return new PaneLayout();
    }

    /**
     * Create an instance of {@link Layout }
     * 
     */
    public Layout createLayout() {
        return new Layout();
    }

    /**
     * Create an instance of {@link LayoutExtension }
     * 
     */
    public LayoutExtension createLayoutExtension() {
        return new LayoutExtension();
    }

    /**
     * Create an instance of {@link CodingCapabilities }
     * 
     */
    public CodingCapabilities createCodingCapabilities() {
        return new CodingCapabilities();
    }

    /**
     * Create an instance of {@link LayoutOptions }
     * 
     */
    public LayoutOptions createLayoutOptions() {
        return new LayoutOptions();
    }

    /**
     * Create an instance of {@link LayoutOptionsExtension }
     * 
     */
    public LayoutOptionsExtension createLayoutOptionsExtension() {
        return new LayoutOptionsExtension();
    }

    /**
     * Create an instance of {@link PaneLayoutOptions }
     * 
     */
    public PaneLayoutOptions createPaneLayoutOptions() {
        return new PaneLayoutOptions();
    }

    /**
     * Create an instance of {@link PaneOptionExtension }
     * 
     */
    public PaneOptionExtension createPaneOptionExtension() {
        return new PaneOptionExtension();
    }

    /**
     * Create an instance of {@link Receiver }
     * 
     */
    public Receiver createReceiver() {
        return new Receiver();
    }

    /**
     * Create an instance of {@link ReceiverConfiguration }
     * 
     */
    public ReceiverConfiguration createReceiverConfiguration() {
        return new ReceiverConfiguration();
    }

    /**
     * Create an instance of {@link ReceiverStateInformation }
     * 
     */
    public ReceiverStateInformation createReceiverStateInformation() {
        return new ReceiverStateInformation();
    }

    /**
     * Create an instance of {@link SourceReference }
     * 
     */
    public SourceReference createSourceReference() {
        return new SourceReference();
    }

    /**
     * Create an instance of {@link DateTimeRange }
     * 
     */
    public DateTimeRange createDateTimeRange() {
        return new DateTimeRange();
    }

    /**
     * Create an instance of {@link RecordingSummary }
     * 
     */
    public RecordingSummary createRecordingSummary() {
        return new RecordingSummary();
    }

    /**
     * Create an instance of {@link SearchScope }
     * 
     */
    public SearchScope createSearchScope() {
        return new SearchScope();
    }

    /**
     * Create an instance of {@link SearchScopeExtension }
     * 
     */
    public SearchScopeExtension createSearchScopeExtension() {
        return new SearchScopeExtension();
    }

    /**
     * Create an instance of {@link EventFilter }
     * 
     */
    public EventFilter createEventFilter() {
        return new EventFilter();
    }

    /**
     * Create an instance of {@link PTZPositionFilter }
     * 
     */
    public PTZPositionFilter createPTZPositionFilter() {
        return new PTZPositionFilter();
    }

    /**
     * Create an instance of {@link MetadataFilter }
     * 
     */
    public MetadataFilter createMetadataFilter() {
        return new MetadataFilter();
    }

    /**
     * Create an instance of {@link FindRecordingResultList }
     * 
     */
    public FindRecordingResultList createFindRecordingResultList() {
        return new FindRecordingResultList();
    }

    /**
     * Create an instance of {@link FindEventResultList }
     * 
     */
    public FindEventResultList createFindEventResultList() {
        return new FindEventResultList();
    }

    /**
     * Create an instance of {@link FindEventResult }
     * 
     */
    public FindEventResult createFindEventResult() {
        return new FindEventResult();
    }

    /**
     * Create an instance of {@link FindPTZPositionResultList }
     * 
     */
    public FindPTZPositionResultList createFindPTZPositionResultList() {
        return new FindPTZPositionResultList();
    }

    /**
     * Create an instance of {@link FindPTZPositionResult }
     * 
     */
    public FindPTZPositionResult createFindPTZPositionResult() {
        return new FindPTZPositionResult();
    }

    /**
     * Create an instance of {@link FindMetadataResultList }
     * 
     */
    public FindMetadataResultList createFindMetadataResultList() {
        return new FindMetadataResultList();
    }

    /**
     * Create an instance of {@link FindMetadataResult }
     * 
     */
    public FindMetadataResult createFindMetadataResult() {
        return new FindMetadataResult();
    }

    /**
     * Create an instance of {@link RecordingInformation }
     * 
     */
    public RecordingInformation createRecordingInformation() {
        return new RecordingInformation();
    }

    /**
     * Create an instance of {@link RecordingSourceInformation }
     * 
     */
    public RecordingSourceInformation createRecordingSourceInformation() {
        return new RecordingSourceInformation();
    }

    /**
     * Create an instance of {@link TrackInformation }
     * 
     */
    public TrackInformation createTrackInformation() {
        return new TrackInformation();
    }

    /**
     * Create an instance of {@link MediaAttributes }
     * 
     */
    public MediaAttributes createMediaAttributes() {
        return new MediaAttributes();
    }

    /**
     * Create an instance of {@link TrackAttributes }
     * 
     */
    public TrackAttributes createTrackAttributes() {
        return new TrackAttributes();
    }

    /**
     * Create an instance of {@link TrackAttributesExtension }
     * 
     */
    public TrackAttributesExtension createTrackAttributesExtension() {
        return new TrackAttributesExtension();
    }

    /**
     * Create an instance of {@link VideoAttributes }
     * 
     */
    public VideoAttributes createVideoAttributes() {
        return new VideoAttributes();
    }

    /**
     * Create an instance of {@link AudioAttributes }
     * 
     */
    public AudioAttributes createAudioAttributes() {
        return new AudioAttributes();
    }

    /**
     * Create an instance of {@link MetadataAttributes }
     * 
     */
    public MetadataAttributes createMetadataAttributes() {
        return new MetadataAttributes();
    }

    /**
     * Create an instance of {@link RecordingConfiguration }
     * 
     */
    public RecordingConfiguration createRecordingConfiguration() {
        return new RecordingConfiguration();
    }

    /**
     * Create an instance of {@link TrackConfiguration }
     * 
     */
    public TrackConfiguration createTrackConfiguration() {
        return new TrackConfiguration();
    }

    /**
     * Create an instance of {@link GetRecordingsResponseItem }
     * 
     */
    public GetRecordingsResponseItem createGetRecordingsResponseItem() {
        return new GetRecordingsResponseItem();
    }

    /**
     * Create an instance of {@link GetTracksResponseList }
     * 
     */
    public GetTracksResponseList createGetTracksResponseList() {
        return new GetTracksResponseList();
    }

    /**
     * Create an instance of {@link GetTracksResponseItem }
     * 
     */
    public GetTracksResponseItem createGetTracksResponseItem() {
        return new GetTracksResponseItem();
    }

    /**
     * Create an instance of {@link RecordingJobConfiguration }
     * 
     */
    public RecordingJobConfiguration createRecordingJobConfiguration() {
        return new RecordingJobConfiguration();
    }

    /**
     * Create an instance of {@link RecordingJobConfigurationExtension }
     * 
     */
    public RecordingJobConfigurationExtension createRecordingJobConfigurationExtension() {
        return new RecordingJobConfigurationExtension();
    }

    /**
     * Create an instance of {@link RecordingJobSource }
     * 
     */
    public RecordingJobSource createRecordingJobSource() {
        return new RecordingJobSource();
    }

    /**
     * Create an instance of {@link RecordingJobSourceExtension }
     * 
     */
    public RecordingJobSourceExtension createRecordingJobSourceExtension() {
        return new RecordingJobSourceExtension();
    }

    /**
     * Create an instance of {@link RecordingJobTrack }
     * 
     */
    public RecordingJobTrack createRecordingJobTrack() {
        return new RecordingJobTrack();
    }

    /**
     * Create an instance of {@link RecordingJobStateInformation }
     * 
     */
    public RecordingJobStateInformation createRecordingJobStateInformation() {
        return new RecordingJobStateInformation();
    }

    /**
     * Create an instance of {@link RecordingJobStateInformationExtension }
     * 
     */
    public RecordingJobStateInformationExtension createRecordingJobStateInformationExtension() {
        return new RecordingJobStateInformationExtension();
    }

    /**
     * Create an instance of {@link RecordingJobStateSource }
     * 
     */
    public RecordingJobStateSource createRecordingJobStateSource() {
        return new RecordingJobStateSource();
    }

    /**
     * Create an instance of {@link RecordingJobStateTracks }
     * 
     */
    public RecordingJobStateTracks createRecordingJobStateTracks() {
        return new RecordingJobStateTracks();
    }

    /**
     * Create an instance of {@link RecordingJobStateTrack }
     * 
     */
    public RecordingJobStateTrack createRecordingJobStateTrack() {
        return new RecordingJobStateTrack();
    }

    /**
     * Create an instance of {@link GetRecordingJobsResponseItem }
     * 
     */
    public GetRecordingJobsResponseItem createGetRecordingJobsResponseItem() {
        return new GetRecordingJobsResponseItem();
    }

    /**
     * Create an instance of {@link ReplayConfiguration }
     * 
     */
    public ReplayConfiguration createReplayConfiguration() {
        return new ReplayConfiguration();
    }

    /**
     * Create an instance of {@link AnalyticsEngine }
     * 
     */
    public AnalyticsEngine createAnalyticsEngine() {
        return new AnalyticsEngine();
    }

    /**
     * Create an instance of {@link AnalyticsDeviceEngineConfiguration }
     * 
     */
    public AnalyticsDeviceEngineConfiguration createAnalyticsDeviceEngineConfiguration() {
        return new AnalyticsDeviceEngineConfiguration();
    }

    /**
     * Create an instance of {@link AnalyticsDeviceEngineConfigurationExtension }
     * 
     */
    public AnalyticsDeviceEngineConfigurationExtension createAnalyticsDeviceEngineConfigurationExtension() {
        return new AnalyticsDeviceEngineConfigurationExtension();
    }

    /**
     * Create an instance of {@link EngineConfiguration }
     * 
     */
    public EngineConfiguration createEngineConfiguration() {
        return new EngineConfiguration();
    }

    /**
     * Create an instance of {@link AnalyticsEngineInputInfo }
     * 
     */
    public AnalyticsEngineInputInfo createAnalyticsEngineInputInfo() {
        return new AnalyticsEngineInputInfo();
    }

    /**
     * Create an instance of {@link AnalyticsEngineInputInfoExtension }
     * 
     */
    public AnalyticsEngineInputInfoExtension createAnalyticsEngineInputInfoExtension() {
        return new AnalyticsEngineInputInfoExtension();
    }

    /**
     * Create an instance of {@link AnalyticsEngineInput }
     * 
     */
    public AnalyticsEngineInput createAnalyticsEngineInput() {
        return new AnalyticsEngineInput();
    }

    /**
     * Create an instance of {@link SourceIdentification }
     * 
     */
    public SourceIdentification createSourceIdentification() {
        return new SourceIdentification();
    }

    /**
     * Create an instance of {@link SourceIdentificationExtension }
     * 
     */
    public SourceIdentificationExtension createSourceIdentificationExtension() {
        return new SourceIdentificationExtension();
    }

    /**
     * Create an instance of {@link MetadataInput }
     * 
     */
    public MetadataInput createMetadataInput() {
        return new MetadataInput();
    }

    /**
     * Create an instance of {@link MetadataInputExtension }
     * 
     */
    public MetadataInputExtension createMetadataInputExtension() {
        return new MetadataInputExtension();
    }

    /**
     * Create an instance of {@link AnalyticsEngineControl }
     * 
     */
    public AnalyticsEngineControl createAnalyticsEngineControl() {
        return new AnalyticsEngineControl();
    }

    /**
     * Create an instance of {@link AnalyticsStateInformation }
     * 
     */
    public AnalyticsStateInformation createAnalyticsStateInformation() {
        return new AnalyticsStateInformation();
    }

    /**
     * Create an instance of {@link AnalyticsState }
     * 
     */
    public AnalyticsState createAnalyticsState() {
        return new AnalyticsState();
    }

    /**
     * Create an instance of {@link ActionEngineEventPayload }
     * 
     */
    public ActionEngineEventPayload createActionEngineEventPayload() {
        return new ActionEngineEventPayload();
    }

    /**
     * Create an instance of {@link ActionEngineEventPayloadExtension }
     * 
     */
    public ActionEngineEventPayloadExtension createActionEngineEventPayloadExtension() {
        return new ActionEngineEventPayloadExtension();
    }

    /**
     * Create an instance of {@link AudioClassCandidate }
     * 
     */
    public AudioClassCandidate createAudioClassCandidate() {
        return new AudioClassCandidate();
    }

    /**
     * Create an instance of {@link AudioClassDescriptor }
     * 
     */
    public AudioClassDescriptor createAudioClassDescriptor() {
        return new AudioClassDescriptor();
    }

    /**
     * Create an instance of {@link AudioClassDescriptorExtension }
     * 
     */
    public AudioClassDescriptorExtension createAudioClassDescriptorExtension() {
        return new AudioClassDescriptorExtension();
    }

    /**
     * Create an instance of {@link OSDReference }
     * 
     */
    public OSDReference createOSDReference() {
        return new OSDReference();
    }

    /**
     * Create an instance of {@link OSDPosConfiguration }
     * 
     */
    public OSDPosConfiguration createOSDPosConfiguration() {
        return new OSDPosConfiguration();
    }

    /**
     * Create an instance of {@link OSDPosConfigurationExtension }
     * 
     */
    public OSDPosConfigurationExtension createOSDPosConfigurationExtension() {
        return new OSDPosConfigurationExtension();
    }

    /**
     * Create an instance of {@link OSDColor }
     * 
     */
    public OSDColor createOSDColor() {
        return new OSDColor();
    }

    /**
     * Create an instance of {@link OSDTextConfiguration }
     * 
     */
    public OSDTextConfiguration createOSDTextConfiguration() {
        return new OSDTextConfiguration();
    }

    /**
     * Create an instance of {@link OSDTextConfigurationExtension }
     * 
     */
    public OSDTextConfigurationExtension createOSDTextConfigurationExtension() {
        return new OSDTextConfigurationExtension();
    }

    /**
     * Create an instance of {@link OSDImgConfiguration }
     * 
     */
    public OSDImgConfiguration createOSDImgConfiguration() {
        return new OSDImgConfiguration();
    }

    /**
     * Create an instance of {@link OSDImgConfigurationExtension }
     * 
     */
    public OSDImgConfigurationExtension createOSDImgConfigurationExtension() {
        return new OSDImgConfigurationExtension();
    }

    /**
     * Create an instance of {@link ColorspaceRange }
     * 
     */
    public ColorspaceRange createColorspaceRange() {
        return new ColorspaceRange();
    }

    /**
     * Create an instance of {@link ColorOptions }
     * 
     */
    public ColorOptions createColorOptions() {
        return new ColorOptions();
    }

    /**
     * Create an instance of {@link OSDColorOptions }
     * 
     */
    public OSDColorOptions createOSDColorOptions() {
        return new OSDColorOptions();
    }

    /**
     * Create an instance of {@link OSDColorOptionsExtension }
     * 
     */
    public OSDColorOptionsExtension createOSDColorOptionsExtension() {
        return new OSDColorOptionsExtension();
    }

    /**
     * Create an instance of {@link OSDTextOptions }
     * 
     */
    public OSDTextOptions createOSDTextOptions() {
        return new OSDTextOptions();
    }

    /**
     * Create an instance of {@link OSDTextOptionsExtension }
     * 
     */
    public OSDTextOptionsExtension createOSDTextOptionsExtension() {
        return new OSDTextOptionsExtension();
    }

    /**
     * Create an instance of {@link OSDImgOptions }
     * 
     */
    public OSDImgOptions createOSDImgOptions() {
        return new OSDImgOptions();
    }

    /**
     * Create an instance of {@link OSDImgOptionsExtension }
     * 
     */
    public OSDImgOptionsExtension createOSDImgOptionsExtension() {
        return new OSDImgOptionsExtension();
    }

    /**
     * Create an instance of {@link OSDConfiguration }
     * 
     */
    public OSDConfiguration createOSDConfiguration() {
        return new OSDConfiguration();
    }

    /**
     * Create an instance of {@link OSDConfigurationExtension }
     * 
     */
    public OSDConfigurationExtension createOSDConfigurationExtension() {
        return new OSDConfigurationExtension();
    }

    /**
     * Create an instance of {@link MaximumNumberOfOSDs }
     * 
     */
    public MaximumNumberOfOSDs createMaximumNumberOfOSDs() {
        return new MaximumNumberOfOSDs();
    }

    /**
     * Create an instance of {@link OSDConfigurationOptions }
     * 
     */
    public OSDConfigurationOptions createOSDConfigurationOptions() {
        return new OSDConfigurationOptions();
    }

    /**
     * Create an instance of {@link OSDConfigurationOptionsExtension }
     * 
     */
    public OSDConfigurationOptionsExtension createOSDConfigurationOptionsExtension() {
        return new OSDConfigurationOptionsExtension();
    }

    /**
     * Create an instance of {@link FileProgress }
     * 
     */
    public FileProgress createFileProgress() {
        return new FileProgress();
    }

    /**
     * Create an instance of {@link ArrayOfFileProgress }
     * 
     */
    public ArrayOfFileProgress createArrayOfFileProgress() {
        return new ArrayOfFileProgress();
    }

    /**
     * Create an instance of {@link ArrayOfFileProgressExtension }
     * 
     */
    public ArrayOfFileProgressExtension createArrayOfFileProgressExtension() {
        return new ArrayOfFileProgressExtension();
    }

    /**
     * Create an instance of {@link StorageReferencePath }
     * 
     */
    public StorageReferencePath createStorageReferencePath() {
        return new StorageReferencePath();
    }

    /**
     * Create an instance of {@link StorageReferencePathExtension }
     * 
     */
    public StorageReferencePathExtension createStorageReferencePathExtension() {
        return new StorageReferencePathExtension();
    }

    /**
     * Create an instance of {@link ConfigDescription.Messages }
     * 
     */
    public ConfigDescription.Messages createConfigDescriptionMessages() {
        return new ConfigDescription.Messages();
    }

    /**
     * Create an instance of {@link Behaviour.Removed }
     * 
     */
    public Behaviour.Removed createBehaviourRemoved() {
        return new Behaviour.Removed();
    }

    /**
     * Create an instance of {@link Behaviour.Idle }
     * 
     */
    public Behaviour.Idle createBehaviourIdle() {
        return new Behaviour.Idle();
    }

    /**
     * Create an instance of {@link ClassDescriptor.ClassCandidate }
     * 
     */
    public ClassDescriptor.ClassCandidate createClassDescriptorClassCandidate() {
        return new ClassDescriptor.ClassCandidate();
    }

    /**
     * Create an instance of {@link ColorDescriptor.ColorCluster }
     * 
     */
    public ColorDescriptor.ColorCluster createColorDescriptorColorCluster() {
        return new ColorDescriptor.ColorCluster();
    }

    /**
     * Create an instance of {@link ItemListDescription.SimpleItemDescription }
     * 
     */
    public ItemListDescription.SimpleItemDescription createItemListDescriptionSimpleItemDescription() {
        return new ItemListDescription.SimpleItemDescription();
    }

    /**
     * Create an instance of {@link ItemListDescription.ElementItemDescription }
     * 
     */
    public ItemListDescription.ElementItemDescription createItemListDescriptionElementItemDescription() {
        return new ItemListDescription.ElementItemDescription();
    }

    /**
     * Create an instance of {@link EventSubscription.SubscriptionPolicy }
     * 
     */
    public EventSubscription.SubscriptionPolicy createEventSubscriptionSubscriptionPolicy() {
        return new EventSubscription.SubscriptionPolicy();
    }

    /**
     * Create an instance of {@link ItemList.SimpleItem }
     * 
     */
    public ItemList.SimpleItem createItemListSimpleItem() {
        return new ItemList.SimpleItem();
    }

    /**
     * Create an instance of {@link ItemList.ElementItem }
     * 
     */
    public ItemList.ElementItem createItemListElementItem() {
        return new ItemList.ElementItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoSourceConfiguration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VideoSourceConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "VideoSourceConfiguration")
    public JAXBElement<VideoSourceConfiguration> createVideoSourceConfiguration(VideoSourceConfiguration value) {
        return new JAXBElement<VideoSourceConfiguration>(_VideoSourceConfiguration_QNAME, VideoSourceConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudioSourceConfiguration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AudioSourceConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "AudioSourceConfiguration")
    public JAXBElement<AudioSourceConfiguration> createAudioSourceConfiguration(AudioSourceConfiguration value) {
        return new JAXBElement<AudioSourceConfiguration>(_AudioSourceConfiguration_QNAME, AudioSourceConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoEncoderConfiguration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VideoEncoderConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "VideoEncoderConfiguration")
    public JAXBElement<VideoEncoderConfiguration> createVideoEncoderConfiguration(VideoEncoderConfiguration value) {
        return new JAXBElement<VideoEncoderConfiguration>(_VideoEncoderConfiguration_QNAME, VideoEncoderConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudioEncoderConfiguration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AudioEncoderConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "AudioEncoderConfiguration")
    public JAXBElement<AudioEncoderConfiguration> createAudioEncoderConfiguration(AudioEncoderConfiguration value) {
        return new JAXBElement<AudioEncoderConfiguration>(_AudioEncoderConfiguration_QNAME, AudioEncoderConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoAnalyticsConfiguration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VideoAnalyticsConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "VideoAnalyticsConfiguration")
    public JAXBElement<VideoAnalyticsConfiguration> createVideoAnalyticsConfiguration(VideoAnalyticsConfiguration value) {
        return new JAXBElement<VideoAnalyticsConfiguration>(_VideoAnalyticsConfiguration_QNAME, VideoAnalyticsConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PTZConfiguration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PTZConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "PTZConfiguration")
    public JAXBElement<PTZConfiguration> createPTZConfiguration(PTZConfiguration value) {
        return new JAXBElement<PTZConfiguration>(_PTZConfiguration_QNAME, PTZConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataConfiguration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MetadataConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "MetadataConfiguration")
    public JAXBElement<MetadataConfiguration> createMetadataConfiguration(MetadataConfiguration value) {
        return new JAXBElement<MetadataConfiguration>(_MetadataConfiguration_QNAME, MetadataConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudioOutputConfiguration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AudioOutputConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "AudioOutputConfiguration")
    public JAXBElement<AudioOutputConfiguration> createAudioOutputConfiguration(AudioOutputConfiguration value) {
        return new JAXBElement<AudioOutputConfiguration>(_AudioOutputConfiguration_QNAME, AudioOutputConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudioDecoderConfiguration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AudioDecoderConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "AudioDecoderConfiguration")
    public JAXBElement<AudioDecoderConfiguration> createAudioDecoderConfiguration(AudioDecoderConfiguration value) {
        return new JAXBElement<AudioDecoderConfiguration>(_AudioDecoderConfiguration_QNAME, AudioDecoderConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Polygon }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Polygon }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "Polygon")
    public JAXBElement<Polygon> createPolygon(Polygon value) {
        return new JAXBElement<Polygon>(_Polygon_QNAME, Polygon.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Polyline }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Polyline }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "Polyline")
    public JAXBElement<Polyline> createPolyline(Polyline value) {
        return new JAXBElement<Polyline>(_Polyline_QNAME, Polyline.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataStream }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MetadataStream }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "MetadataStream")
    public JAXBElement<MetadataStream> createMetadataStream(MetadataStream value) {
        return new JAXBElement<MetadataStream>(_MetadataStream_QNAME, MetadataStream.class, null, value);
    }

}

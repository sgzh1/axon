package ru.stepanovgzh.axon.cqrs.bike.command;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;
import ru.stepanovgzh.axon.data.model.types.BikeColour;

import java.util.UUID;

@Value
public class UpdateBikeCommand
{
    @TargetAggregateIdentifier
    UUID id;
    String name;
    String description;
    BikeColour colour;
}

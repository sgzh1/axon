package ru.stepanovgzh.axon.cqrs.bike.command;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.UUID;

@Value
public class ReturnBikeCommand
{
    @TargetAggregateIdentifier
    UUID id;
    double mileage;
}
